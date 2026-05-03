package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import huutai.dev.meetmino.core.design.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    title: String,
    modifier: Modifier = Modifier,
    navigationIcon: ImageVector? = null,
    onNavigationClick: (() -> Unit)? = null,
    actions: List<Pair<ImageVector, () -> Unit>> = emptyList()
) {

    TopAppBar(
        modifier = modifier.fillMaxWidth(),

        title = {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = AppTheme.colors.textPrimary
            )
        },

        navigationIcon = {
            if (navigationIcon != null) {
                IconButton(
                    onClick = { onNavigationClick?.invoke() }
                ) {
                    Icon(
                        imageVector = navigationIcon,
                        contentDescription = "Back",
                        tint = AppTheme.colors.primary
                    )
                }
            }
        },

        actions = {
            actions.forEach { (icon, onClick) ->
                IconButton(onClick = onClick) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = AppTheme.colors.primary
                    )
                }
            }
        },

        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = AppTheme.colors.surface,
            titleContentColor = AppTheme.colors.textPrimary,
            navigationIconContentColor = AppTheme.colors.primary,
            actionIconContentColor = AppTheme.colors.primary
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppCenteredTopBar(
    title: String,
    modifier: Modifier = Modifier,
    actions: List<Pair<ImageVector, () -> Unit>> = emptyList()
) {

    CenterAlignedTopAppBar(
        modifier = modifier.fillMaxWidth(),

        title = {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = AppTheme.colors.textPrimary
            )
        },

        actions = {
            actions.forEach { (icon, onClick) ->
                IconButton(onClick = onClick) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = AppTheme.colors.primary
                    )
                }
            }
        },

        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = AppTheme.colors.surface,
            titleContentColor = AppTheme.colors.textPrimary,
            actionIconContentColor = AppTheme.colors.primary
        )
    )
}