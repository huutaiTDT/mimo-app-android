package huutai.dev.meetmino.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import huutai.dev.meetmino.R
import huutai.dev.meetmino.core.design.component.AppChip
import huutai.dev.meetmino.core.design.component.AppPrimaryButton
import huutai.dev.meetmino.core.design.component.AppSecondaryButton
import huutai.dev.meetmino.core.design.component.AppText
import huutai.dev.meetmino.core.design.component.AppTextVariant
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.MeetMinoTheme
import kotlinx.coroutines.launch

fun onboardingData() = listOf(
    OnboardingPageData(
        background = R.drawable.ob1,
        title = "Whatever You Need",
        subtitle = "Wherever You Are",
        description = "Theo dõi, lưu giữ và chia sẻ hành trình.",
        features = listOf("Tracking", "Sharing", "Memory")
    ),
    OnboardingPageData(
        background = R.drawable.ob2,
        title = "Track Every",
        subtitle = "Moment Clearly",
        description = "Ghi lại mọi khoảnh khắc.",
        features = listOf("Fast", "Log", "Map")
    ),
    OnboardingPageData(
        background = R.drawable.ob3,
        title = "Share With",
        subtitle = "Friends",
        description = "Kết nối và chia sẻ.",
        features = listOf("Social", "Nearby", "Discover")
    ),
    OnboardingPageData(
        background = R.drawable.ob4,
        title = "Your Journey",
        subtitle = "On Map",
        description = "Xem lại hành trình.",
        features = listOf("History", "Route", "Map")
    )
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(
    onFinishOnboarding: () -> Unit
) {
    val pages = remember { onboardingData() }

    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { pages.size }
    )

    val scope = rememberCoroutineScope()

    MeetMinoTheme {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxSize()
            ) { page ->

                val offset = (
                        pagerState.currentPage - page +
                                pagerState.currentPageOffsetFraction
                        )

                OnboardingPage(
                    item = pages[page],
                    pageOffset = offset
                )
            }


            // TOP BAR
            OnboardingTopBar(
                pageCount = pages.size,
                currentPage = pagerState.currentPage,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(horizontal = 10.dp, vertical = 40.dp)
            )

            // BOTTOM CTA
            BottomCTA(
                isLast = pagerState.currentPage == pages.lastIndex,
                onNext = {
                    scope.launch {
                        pagerState.animateScrollToPage(pagerState.currentPage + 1)
                    }
                },
                onFinish = onFinishOnboarding,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
            )
        }
    }
}


@Composable
fun OnboardingPage(
    item: OnboardingPageData,
    pageOffset: Float
) {
    Box(modifier = Modifier.fillMaxSize()) {

        // BACKGROUND IMAGE (FULL)
        Image(
            painter = painterResource(item.background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer {
                    translationX = pageOffset * 60f // parallax nhẹ
                },
            contentScale = ContentScale.Crop
        )

        // GRADIENT OVERLAY (LEFT)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            Color.Transparent,
                            AppTheme.colors.primary.copy(alpha = 0.1f),
                            AppTheme.colors.primary.copy(alpha = 0.2f),
                        )
                    )
                )
        )

        // CONTENT
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, top = 120.dp, end = 24.dp)
        ) {

            AppText(
                text = item.title,
                variant = AppTextVariant.Display,
                color = AppTheme.colors.primary,
                bold = true
            )

            AppText(
                text = item.subtitle,
                variant = AppTextVariant.Display,
                color = AppTheme.colors.primary,
                bold = true
            )

            Spacer(modifier = Modifier.height(12.dp))

            AppText(
                text = item.description,
                variant = AppTextVariant.Body,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                item.features.forEach {
                    AppChip(text = it)
                }
            }
        }

    }
}

@Composable
private fun OnboardingTopBar(
    pageCount: Int,
    currentPage: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
            repeat(pageCount) { index ->
                Box(
                    modifier = Modifier
                        .height(8.dp)
                        .width(if (index == currentPage) 24.dp else 8.dp)
                        .clip(RoundedCornerShape(100))
                        .background(
                            if (index == currentPage)
                                AppTheme.colors.primary
                            else
                                Color.White.copy(alpha = 0.4f)
                        )
                )
            }
        }

        AppChip(text = "English")
    }
}

@Composable
fun BottomCTA(
    isLast: Boolean,
    onNext: () -> Unit,
    onFinish: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        Color.White.copy(alpha = 0.9f)
                    )
                )
            )
            .padding(horizontal = 20.dp, vertical = 16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            AppSecondaryButton(
                text = "Skip",
                onClick = onFinish,
                modifier = Modifier.weight(1f)
            )

            AppPrimaryButton(
                text = if (isLast) "Start" else "Next",
                onClick = {
                    if (!isLast) onNext() else onFinish()
                },
                modifier = Modifier.weight(1f)
            )
        }
    }
}

data class OnboardingPageData(
    val background: Int,
    val title: String,
    val subtitle: String,
    val description: String,
    val features: List<String>
)