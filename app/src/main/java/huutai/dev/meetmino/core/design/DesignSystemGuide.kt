package huutai.dev.meetmino.core.design

/**
 * 🎨 DESIGN SYSTEM GUIDE - Meet Mino Travel App
 *
 * Soft, friendly, emotional design with green gradient system
 * Jetpack Compose + Material3 implementation
 *
 * ══════════════════════════════════════════════════════════════════════
 *
 * 📋 FILE ORGANIZATION
 *
 * core/design/theme/
 *   ├── Color.kt              // Light/Dark color palettes + semantic mapping
 *   ├── Gradient.kt           // 6 signature gradients (primary, success, error, etc)
 *   ├── Shape.kt              // Rounded corners (8, 16, 24dp)
 *   ├── Elevation.kt          // Shadow depths (2, 4, 8, 12, 16, 24dp)
 *   ├── Typography.kt         // Material3 typography system
 *   ├── Spacing.kt            // Layout grid (4, 8, 16, 24, 32, 48dp)
 *   └── Theme.kt              // Main AppTheme composable + LocalAppColors
 *
 * core/design/component/
 *   ├── AppButton.kt          // Primary, Secondary, Success, Error buttons
 *   ├── AppCard.kt            // Card, ElevatedCard, GradientCard
 *   ├── AppState.kt           // EmptyState, SuccessState, ErrorState
 *   ├── AppTextField.kt       // Text input with error handling
 *   ├── AppFloatingActionButton.kt  // FAB + ExtendedFAB + FABCluster
 *   ├── AppDialog.kt          // AlertDialog + ConfirmDialog
 *   └── AppTopBar.kt          // TopAppBar + CenteredTopBar
 *
 * ══════════════════════════════════════════════════════════════════════
 *
 * 🎯 USAGE PATTERNS
 *
 * 1️⃣ WRAP APP WITH THEME
 * ─────────────────────────────────────────────────────────────────
 *
 * @Composable
 * fun MyApp() {
 *     AppTheme {
 *         MainScreen()
 *     }
 * }
 *
 * 2️⃣ ACCESS COLORS
 * ─────────────────────────────────────────────────────────────────
 *
 * @Composable
 * fun MyScreen() {
 *     val colors = AppTheme.colors  // Get current color scheme
 *
 *     Box(
 *         modifier = Modifier.background(colors.background)
 *     ) {
 *         Text("Hello", color = colors.textPrimary)
 *     }
 * }
 *
 * 3️⃣ USE COMPONENTS
 * ─────────────────────────────────────────────────────────────────
 *
 * @Composable
 * fun HomeScreen() {
 *     AppTheme {
 *         Column {
 *             // Top Bar
 *             AppTopBar(
 *                 title = "Meet Mino",
 *                 navigationIcon = Icons.Default.Menu
 *             )
 *
 *             // Card
 *             AppCard {
 *                 Text("Card content")
 *             }
 *
 *             // Button
 *             AppPrimaryButton(
 *                 text = "Explore",
 *                 onClick = { }
 *             )
 *
 *             // FAB
 *             AppFloatingActionButton(
 *                 icon = Icons.Default.Search,
 *                 contentDescription = "Search"
 *             )
 *         }
 *     }
 * }
 *
 * 4️⃣ USE SPACING
 * ─────────────────────────────────────────────────────────────────
 *
 * Column(
 *     modifier = Modifier.padding(Spacing.md)
 * ) {
 *     Text("Title")
 *     Spacer(modifier = Modifier.height(Spacing.sm))
 *     Text("Subtitle")
 * }
 *
 * 5️⃣ USE SHAPES
 * ─────────────────────────────────────────────────────────────────
 *
 * Box(
 *     modifier = Modifier
 *         .background(color = colors.primary, shape = AppShapes.Large)
 *         .clip(AppShapes.Pill)
 * )
 *
 * 6️⃣ USE GRADIENTS
 * ─────────────────────────────────────────────────────────────────
 *
 * Box(
 *     modifier = Modifier.background(
 *         brush = AppGradients.PrimaryGradient,
 *         shape = AppShapes.Large
 *     )
 * )
 *
 * 7️⃣ ERROR STATES
 * ─────────────────────────────────────────────────────────────────
 *
 * AppTextField(
 *     value = inputText,
 *     onValueChange = { },
 *     isError = showError,
 *     placeholder = "Enter email"
 * )
 *
 * 8️⃣ EMPTY STATES
 * ─────────────────────────────────────────────────────────────────
 *
 * if (trips.isEmpty()) {
 *     EmptyState(
 *         icon = Icons.Default.MapOutlined,
 *         title = "No trips yet",
 *         message = "Start planning your first adventure",
 *         actionLabel = "Create Trip",
 *         onAction = { }
 *     )
 * }
 *
 * 9️⃣ DIALOGS
 * ─────────────────────────────────────────────────────────────────
 *
 * AppConfirmDialog(
 *     title = "Delete trip?",
 *     message = "This action cannot be undone",
 *     onConfirm = { },
 *     onCancel = { },
 *     isDangerous = true
 * )
 *
 * ══════════════════════════════════════════════════════════════════════
 *
 * 🌗 DARK MODE SUPPORT
 *
 * All components automatically support dark mode through AppTheme
 * No additional code needed - colors adapt automatically
 *
 * Light Mode:
 *   - Background: #F5F7F6 (soft white)
 *   - Text: #263238 (deep blue-gray)
 *   - Primary: #4CAF50 (green)
 *
 * Dark Mode:
 *   - Background: #0F172A (deep navy)
 *   - Text: #E2E8F0 (light gray)
 *   - Primary: #81C784 (light green)
 *
 * ══════════════════════════════════════════════════════════════════════
 *
 * 🎨 SIGNATURE STYLE RULES
 *
 * ✅ DO:
 *    • Use AppShapes.Pill for buttons
 *    • Use AppShapes.Large (24dp) for cards
 *    • Use Spacing constants for all padding
 *    • Use AppTheme.colors for all colors
 *    • Use AppGradients for accents
 *    • Use soft shadows (AppElevation.Card/Floating)
 *    • Use Material3 typography system
 *    • Keep UI minimal and card-based
 *
 * ❌ DON'T:
 *    • Hardcode colors
 *    • Use arbitrary spacing values
 *    • Mix Material2 and Material3 styles
 *    • Create custom shapes instead of AppShapes
 *    • Use harsh shadows
 *    • Ignore dark mode
 *
 * ══════════════════════════════════════════════════════════════════════
 *
 * 🚀 COMPONENT HIERARCHY
 *
 * Theme (top-level)
 *   ├── AppTopBar
 *   ├── Screen Content
 *   │   ├── AppCard
 *   │   │   ├── AppTextField
 *   │   │   ├── AppPrimaryButton
 *   │   │   └── AppSecondaryButton
 *   │   ├── EmptyState / SuccessState / ErrorState
 *   │   └── Lists of AppCards
 *   ├── AppFloatingActionButton
 *   └── AppDialog/AppConfirmDialog
 *
 * ══════════════════════════════════════════════════════════════════════
 *
 * 🎭 MASCOT INTEGRATION
 *
 * Recommended sizes:
 *   • Small: 48.dp (badges, empty state indicators)
 *   • Medium: 96.dp (main empty/success/error states)
 *   • Hero: 160.dp+ (onboarding, main features)
 *
 * Usage:
 *   • EmptyState screens: Medium/Hero
 *   • Success confirmations: Medium
 *   • Error dialogs: Small
 *   • Onboarding: Hero
 *
 * ══════════════════════════════════════════════════════════════════════
 */
