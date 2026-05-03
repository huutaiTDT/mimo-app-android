package huutai.dev.meetmino.screen

import androidx.compose.runtime.Composable
import huutai.dev.meetmino.R
import huutai.dev.meetmino.component.AnimateImg
import huutai.dev.meetmino.component.MainLayout

@Composable
fun ComingSoonScreen(
) {


    MainLayout(
        content = {
            AnimateImg(source = R.raw.comming_soon)

        }

    )


}

