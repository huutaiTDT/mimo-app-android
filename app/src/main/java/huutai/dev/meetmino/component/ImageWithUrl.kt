package huutai.dev.meetmino.component


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest


@Composable
fun ImgWithUrl(
    url: String,
    alt: String = "",
    size: Int = 30,
    modifier: Modifier = Modifier,
    rounded: Int = 0,
    contentScale: ContentScale = ContentScale.Crop
) {

    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(url)
            .crossfade(true)
            .build(),

        contentDescription = alt,

        placeholder = painterResource(com.google.maps.android.ktx.R.drawable.common_google_signin_btn_icon_dark_normal),
        error = painterResource(com.google.maps.android.compose.R.drawable.common_google_signin_btn_icon_dark_normal),

        modifier = modifier
            .size(size.dp)
            .clip(RoundedCornerShape(rounded.dp))
            .background(MaterialTheme.colorScheme.secondary),

        contentScale = contentScale
    )
}
