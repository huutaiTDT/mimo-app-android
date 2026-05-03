package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import huutai.dev.meetmino.core.design.theme.AppElevation
import huutai.dev.meetmino.core.design.theme.AppShapes
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.Spacing

/**
 * App Dialog Component
 * - Rounded corners (24dp)
 * - Soft shadow
 * - Centered, friendly appearance
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppAlertDialog(
    title: String? = null,
    message: String,
    confirmText: String,
    onConfirm: () -> Unit,
    dismissText: String? = null,
    onDismiss: (() -> Unit)? = null,
    showDialog: Boolean = true
) {
    if (showDialog) {
        BasicAlertDialog(
            onDismissRequest = { onDismiss?.invoke() }
        ) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth(0.85f),
                shape = AppShapes.Large,
                color = AppTheme.colors.surface,
                shadowElevation = AppElevation.Dialog
            ) {
                Column(
                    modifier = Modifier.padding(Spacing.lg),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if (title != null) {
                        Text(
                            text = title,
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = AppTheme.colors.textPrimary
                            ),
                            modifier = Modifier.padding(bottom = Spacing.md)
                        )
                    }

                    Text(
                        text = message,
                        style = TextStyle(
                            fontSize = 14.sp,
                            color = AppTheme.colors.textSecondary
                        ),
                        modifier = Modifier.padding(bottom = Spacing.lg)
                    )

                    androidx.compose.foundation.layout.Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = Spacing.md),
                        horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(Spacing.md)
                    ) {
                        if (dismissText != null && onDismiss != null) {
                            AppSecondaryButton(
                                text = dismissText,
                                onClick = { onDismiss() },
                                modifier = Modifier.weight(1f)
                            )
                        }

                        AppPrimaryButton(
                            text = confirmText,
                            onClick = { onConfirm() },
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
        }
    }
}

/**
 * Simple Confirmation Dialog
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppConfirmDialog(
    title: String,
    message: String,
    onConfirm: () -> Unit,
    onCancel: () -> Unit,
    showDialog: Boolean = true,
    confirmText: String = "Confirm",
    cancelText: String = "Cancel",
    isDangerous: Boolean = false
) {
    if (showDialog) {
        BasicAlertDialog(
            onDismissRequest = { onCancel() }
        ) {
            Surface(
                modifier = Modifier.fillMaxWidth(0.85f),
                shape = AppShapes.Large,
                color = AppTheme.colors.surface,
                shadowElevation = AppElevation.Dialog
            ) {
                Column(
                    modifier = Modifier.padding(Spacing.lg),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = title,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = if (isDangerous) AppTheme.colors.error else AppTheme.colors.textPrimary
                        ),
                        modifier = Modifier.padding(bottom = Spacing.md)
                    )

                    Text(
                        text = message,
                        style = TextStyle(
                            fontSize = 14.sp,
                            color = AppTheme.colors.textSecondary
                        ),
                        modifier = Modifier.padding(bottom = Spacing.lg)
                    )

                    androidx.compose.foundation.layout.Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = Spacing.md),
                        horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(Spacing.md)
                    ) {
                        AppSecondaryButton(
                            text = cancelText,
                            onClick = { onCancel() },
                            modifier = Modifier.weight(1f)
                        )

                        if (isDangerous) {
                            AppErrorButton(
                                text = confirmText,
                                onClick = { onConfirm() },
                                modifier = Modifier.weight(1f)
                            )
                        } else {
                            AppPrimaryButton(
                                text = confirmText,
                                onClick = { onConfirm() },
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }
            }
        }
    }
}
