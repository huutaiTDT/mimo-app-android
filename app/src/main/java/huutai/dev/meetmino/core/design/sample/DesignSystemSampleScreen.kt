package huutai.dev.meetmino.core.design.sample

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import huutai.dev.meetmino.core.design.component.AppBadge
import huutai.dev.meetmino.core.design.component.AppBrandHeader
import huutai.dev.meetmino.core.design.component.AppCard
import huutai.dev.meetmino.core.design.component.AppChip
import huutai.dev.meetmino.core.design.component.AppFloatingActionButton
import huutai.dev.meetmino.core.design.component.AppHeader
import huutai.dev.meetmino.core.design.component.AppPrimaryButton
import huutai.dev.meetmino.core.design.component.AppSecondaryButton
import huutai.dev.meetmino.core.design.component.AppStatusChip
import huutai.dev.meetmino.core.design.component.AppSuccessButton
import huutai.dev.meetmino.core.design.component.AppText
import huutai.dev.meetmino.core.design.component.AppTextField
import huutai.dev.meetmino.core.design.component.AppTextVariant
import huutai.dev.meetmino.core.design.component.AppTopBar
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.MeetMinoTheme
import huutai.dev.meetmino.core.design.theme.Spacing

@Composable
fun DesignSystemSampleScreen(navController: NavController) {


    MeetMinoTheme {

        val scrollState = rememberScrollState()

        Scaffold(
            topBar = {
                AppTopBar(
                    title = "Design System",
                    navigationIcon = Icons.Default.Menu,
                    onNavigationClick = {},
                    actions = listOf(
                        Icons.Default.Search to {}
                    )
                )
            },
            floatingActionButton = {
                AppFloatingActionButton(
                    icon = Icons.Default.Edit,
                    contentDescription = "Edit",
                    onClick = {}
                )
            },
            containerColor = AppTheme.colors.background
        ) { padding ->

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(Spacing.md)
                    .verticalScroll(scrollState)
            ) {

                AppBrandHeader()

                Spacer(Modifier.height(Spacing.lg))

                SectionHeader("App Text")

                AppText(
                    text = "Display text",
                    variant = AppTextVariant.Display,
                    color = AppTheme.colors.primary,
                    bold = true
                )

                AppText(
                    text = "Title text",
                    variant = AppTextVariant.Title,
                    bold = true
                )

                AppText(
                    text = "Body text for descriptions and longer copy.",
                    variant = AppTextVariant.Body,
                    color = AppTheme.colors.textSecondary
                )

                Spacer(Modifier.height(Spacing.lg))

                SectionHeader("Header + Chip")

                AppHeader(
                    title = "Explore",
                    subtitle = "Find nearby memories",
                    leadingIcon = Icons.Default.Menu,
                    onLeadingClick = {},
                    actions = listOf(Icons.Default.Search to {}),
                    showDivider = true
                )

                Spacer(Modifier.height(Spacing.md))

                Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                    AppChip(text = "All", selected = true)
                    AppChip(text = "Saved")
                    AppStatusChip(text = "Active")
                    AppBadge(text = "3")
                }

                Spacer(Modifier.height(Spacing.lg))

                SectionHeader("Typography")

                Text(
                    text = "Headline Large",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = AppTheme.colors.textPrimary
                )

                Text(
                    text = "Title Large",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = AppTheme.colors.textPrimary
                )

                Text(
                    text = "Body Large - Example text content",
                    fontSize = 16.sp,
                    color = AppTheme.colors.textSecondary
                )

                Spacer(Modifier.height(Spacing.lg))

                SectionHeader("Colors")

                Row(
                    horizontalArrangement = Arrangement.spacedBy(Spacing.sm)
                ) {
                    ColorBox(
                        color = AppTheme.colors.primary,
                        label = "Primary",
                        modifier = Modifier.weight(1f)
                    )

                    ColorBox(
                        color = AppTheme.colors.secondary,
                        label = "Secondary",
                        modifier = Modifier.weight(1f)
                    )
                }

                Spacer(Modifier.height(Spacing.sm))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(Spacing.sm)
                ) {
                    ColorBox(
                        color = AppTheme.colors.success,
                        label = "Success",
                        modifier = Modifier.weight(1f)
                    )

                    ColorBox(
                        color = AppTheme.colors.error,
                        label = "Error",
                        modifier = Modifier.weight(1f)
                    )
                }

                Spacer(Modifier.height(Spacing.lg))

                SectionHeader("Buttons")

                AppPrimaryButton(
                    text = "Primary Button",
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(Modifier.height(Spacing.md))

                AppSecondaryButton(
                    text = "Secondary Button",
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(Modifier.height(Spacing.md))

                AppSuccessButton(
                    text = "Success Button",
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(Modifier.height(Spacing.lg))

                SectionHeader("Card")

                AppCard {
                    Column(
                        modifier = Modifier.padding(Spacing.md)
                    ) {
                        Text(
                            text = "Travel Memory",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = AppTheme.colors.textPrimary
                        )

                        Spacer(Modifier.height(Spacing.sm))

                        Text(
                            text = "Da Lat Trip • 124km • 24 Photos",
                            color = AppTheme.colors.textSecondary
                        )
                    }
                }

                Spacer(Modifier.height(Spacing.lg))

                SectionHeader("Input")

                AppTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = "Search destination"
                )

                Spacer(Modifier.height(Spacing.md))

                AppTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = "Invalid input",
                    isError = true
                )

                Spacer(Modifier.height(80.dp))
            }
        }
    }
}

@Composable
private fun SectionHeader(title: String) {
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
        color = AppTheme.colors.primary,
        modifier = Modifier.padding(vertical = Spacing.md)
    )
}

@Composable
private fun ColorBox(
    color: Color,
    label: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .background(
                    color = color,
                    shape = RoundedCornerShape(Spacing.md)
                )
        )

        Spacer(Modifier.height(Spacing.sm))

        Text(
            text = label,
            fontSize = 12.sp,
            color = AppTheme.colors.textSecondary
        )
    }
}