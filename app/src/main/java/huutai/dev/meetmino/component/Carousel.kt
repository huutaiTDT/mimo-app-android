package huutai.dev.meetmino.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageCarousel(
    lstImgUrl: List<String>,
    modifier: Modifier = Modifier,
    autoScrollDuration: Long = 3000,
    enableAutoScroll: Boolean = true,
    showIndicator: Boolean = true,
    activeIndicatorColor: Color = Color(0xFF00B7EB),
    inactiveIndicatorColor: Color = Color.LightGray,
    contentDescription: String? = null,
    rounded: Int = 20
) {

    if (lstImgUrl.isEmpty()) return

    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { lstImgUrl.size }
    )

    LaunchedEffect(enableAutoScroll, lstImgUrl.size) {
        if (enableAutoScroll && lstImgUrl.size > 1) {
            while (true) {
                delay(autoScrollDuration)

                val nextPage =
                    if (pagerState.currentPage == lstImgUrl.lastIndex) 0
                    else pagerState.currentPage + 1

                pagerState.animateScrollToPage(nextPage)
            }
        }
    }

    Box(
        modifier = modifier.fillMaxWidth()
    ) {

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->

            Card(
                modifier = Modifier.fillMaxSize(),
                shape = RoundedCornerShape(rounded.dp)
            ) {

                ImgWithUrl(
                    url = lstImgUrl[page],
                    alt = contentDescription ?: "Banner $page",
                    modifier = Modifier.fillMaxSize(),
                    rounded = rounded,
                    contentScale = ContentScale.Crop
                )
            }
        }

        if (showIndicator && lstImgUrl.size > 1) {

            Row(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 12.dp),
                horizontalArrangement = Arrangement.Center
            ) {

                repeat(lstImgUrl.size) { index ->

                    val selected = pagerState.currentPage == index

                    val width by animateDpAsState(
                        targetValue = if (selected) 22.dp else 8.dp,
                        label = ""
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 4.dp)
                            .height(8.dp)
                            .width(width)
                            .clip(CircleShape)
                            .background(
                                if (selected)
                                    activeIndicatorColor
                                else
                                    inactiveIndicatorColor
                            )
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
fun PagerState.scrollToPageSmooth(
    page: Int,
    scope: CoroutineScope
) {
    if (pageCount == 0) return

    val target = page.coerceIn(0, pageCount - 1)

    scope.launch {
        animateScrollToPage(target)
    }
}

@Composable
fun CarouselExample(
    height: Int = 220,
    rounded: Int = 20,
    banners: List<String> = emptyList()
) {
    ImageCarousel(
        lstImgUrl = banners,
        rounded = rounded,
        modifier = Modifier
            .fillMaxWidth()
            .height(height.dp),
        autoScrollDuration = 5000,
        enableAutoScroll = true,
        activeIndicatorColor = MaterialTheme.colorScheme.primary,
        inactiveIndicatorColor = MaterialTheme.colorScheme.secondary
    )
}