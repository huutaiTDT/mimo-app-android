package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.Spacing

/**
 * Empty State Component
 * Used for empty lists, no data screens
 * Features mascot + friendly message
 */
@Composable
fun EmptyState(
    icon: ImageVector,
    title: String,
    message: String,
    actionLabel: String? = null,
    onAction: (() -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(Spacing.lg),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = title,
            modifier = Modifier.size(96.dp),
            tint = AppTheme.colors.primary.copy(alpha = 0.6f)
        )

        Text(
            text = title,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = AppTheme.colors.textPrimary
            ),
            modifier = Modifier.padding(top = Spacing.lg)
        )

        Text(
            text = message,
            style = TextStyle(
                fontSize = 14.sp,
                color = AppTheme.colors.textSecondary
            ),
            modifier = Modifier.padding(top = Spacing.sm)
        )

        if (actionLabel != null && onAction != null) {
            AppPrimaryButton(
                text = actionLabel,
                onClick = onAction,
                modifier = Modifier.padding(top = Spacing.xl)
            )
        }
    }
}

/**
 * Success State Component
 * For confirmation, successful actions
 */
@Composable
fun SuccessState(
    icon: ImageVector,
    title: String,
    message: String,
    actionLabel: String? = null,
    onAction: (() -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(Spacing.lg),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = title,
            modifier = Modifier.size(96.dp),
            tint = AppTheme.colors.success
        )

        Text(
            text = title,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = AppTheme.colors.success
            ),
            modifier = Modifier.padding(top = Spacing.lg)
        )

        Text(
            text = message,
            style = TextStyle(
                fontSize = 14.sp,
                color = AppTheme.colors.textSecondary
            ),
            modifier = Modifier.padding(top = Spacing.sm)
        )

        if (actionLabel != null && onAction != null) {
            AppSuccessButton(
                text = actionLabel,
                onClick = onAction,
                modifier = Modifier.padding(top = Spacing.xl)
            )
        }
    }
}

/**
 * Error State Component
 * For errors, failures, warnings
 */
@Composable
fun ErrorState(
    icon: ImageVector,
    title: String,
    message: String,
    actionLabel: String? = null,
    onAction: (() -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(Spacing.lg),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = title,
            modifier = Modifier.size(96.dp),
            tint = AppTheme.colors.error
        )

        Text(
            text = title,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = AppTheme.colors.error
            ),
            modifier = Modifier.padding(top = Spacing.lg)
        )

        Text(
            text = message,
            style = TextStyle(
                fontSize = 14.sp,
                color = AppTheme.colors.textSecondary
            ),
            modifier = Modifier.padding(top = Spacing.sm)
        )

        if (actionLabel != null && onAction != null) {
            AppErrorButton(
                text = actionLabel,
                onClick = onAction,
                modifier = Modifier.padding(top = Spacing.xl)
            )
        }
    }
}
