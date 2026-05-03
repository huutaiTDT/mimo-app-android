package huutai.dev.meetmino.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import huutai.dev.meetmino.R
import kotlinx.coroutines.launch

@androidx.compose.foundation.ExperimentalFoundationApi
@Composable
fun OnboardingScreen(
    onFinishOnboarding: () -> Unit
) {
    val pages = listOf(
        OnboardingPageData(
            image = R.mipmap.ob_1,
            title = "Add & Manage Cards",
            subtitle = "Track your cards and keep everything organized in one place."
        ),
        OnboardingPageData(
            image = R.mipmap.ob_2,
            title = "Transfer & Receive Money",
            subtitle = "Send and receive money quickly with a simple experience."
        ),
        OnboardingPageData(
            image = R.mipmap.ob_3,
            title = "Pay Bills & Payments",
            subtitle = "Handle payments with a clean, friendly onboarding flow."
        ),
        OnboardingPageData(
            image = R.mipmap.ob_4,
            title = "Pay Bills & Payments",
            subtitle = "Handle payments with a clean, friendly onboarding flow."
        )
    )

    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { pages.size }
    )
    val scope = rememberCoroutineScope()

    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->
            OnboardingPage(item = pages[page])
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(horizontal = 20.dp, vertical = 24.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                pages.forEachIndexed { index, _ ->
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 4.dp)
                            .clip(RoundedCornerShape(50))
                            .background(
                                if (pagerState.currentPage == index) {
                                    MaterialTheme.colorScheme.primary
                                } else {
                                    MaterialTheme.colorScheme.outline.copy(alpha = 0.35f)
                                }
                            )
                            .height(8.dp)
                            .width(if (pagerState.currentPage == index) 24.dp else 8.dp)
                            .clickable {
                                scope.launch {
                                    pagerState.animateScrollToPage(index)
                                }
                            }
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    if (pagerState.currentPage < pages.lastIndex) {
                        scope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    } else {
                        onFinishOnboarding()
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                shape = RoundedCornerShape(999.dp)
            ) {
                Text(
                    text = if (pagerState.currentPage < pages.lastIndex) "Next" else "Get Started",
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
private fun OnboardingPage(item: OnboardingPageData) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = item.image),
            contentDescription = item.title,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.18f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 72.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = item.title,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(14.dp))

            Text(
                text = item.subtitle,
                fontSize = 16.sp,
                color = Color.White.copy(alpha = 0.92f),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(110.dp))
        }
    }
}

private data class OnboardingPageData(
    val image: Int,
    val title: String,
    val subtitle: String
)