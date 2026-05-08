package huutai.dev.meetmino.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Flag
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.NotificationsNone
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Route
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material.icons.filled.TravelExplore
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import huutai.dev.meetmino.R
import huutai.dev.meetmino.core.design.component.AppBadge
import huutai.dev.meetmino.core.design.component.AppCard
import huutai.dev.meetmino.core.design.theme.AppTheme

data class ProfileStat(
	val value: String,
	val label: String,
	val icon: androidx.compose.ui.graphics.vector.ImageVector,
	val tint: Color
)

data class TripCard(
	val imageRes: Int,
	val title: String,
	val dateRange: String,
	val distance: String,
	val photos: String,
	val status: String? = null,
	val statusColor: Color
)

data class BadgeItem(
	val icon: androidx.compose.ui.graphics.vector.ImageVector,
	val title: String,
	val subtitle: String
)

@Composable
fun ProfileScreen(
	modifier: Modifier = Modifier
) {
	val scrollState = rememberScrollState()

	val stats = listOf(
		ProfileStat("42", "Trips", Icons.Default.Route, AppTheme.colors.success),
		ProfileStat("128", "Places", Icons.Default.Place, AppTheme.colors.primary),
		ProfileStat("8,742", "KM Traveled", Icons.Default.Map, AppTheme.colors.blue),
		ProfileStat("389", "Photos & Videos", Icons.Default.Star, AppTheme.colors.warning),
		ProfileStat("316", "Check-ins", Icons.Default.FavoriteBorder, AppTheme.colors.error)
	)

	val trips = listOf(
		TripCard(R.drawable.ob1, "Sapa Adventure", "18 - 21 May 2026", "126 km", "24", "In Progress", AppTheme.colors.primary),
		TripCard(R.drawable.ob2, "Da Lat Trip", "10 - 14 Apr 2026", "124 km", "32", "In Progress",AppTheme.colors.primary),
		TripCard(R.drawable.ob3, "Phu Quoc Getaway", "2 - 6 Mar 2026", "86 km", "18", "In Progress",AppTheme.colors.primary),
		TripCard(R.drawable.ob4, "Bangkok City Walk", "20 - 23 Feb 2026", "96 km", "21", "In Progress",AppTheme.colors.primary)
	)

	val badges = listOf(
		BadgeItem(Icons.Default.TravelExplore, "Explorer", "100 Places"),
		BadgeItem(Icons.Default.Flag, "Road Warrior", "5,000 km"),
		BadgeItem(Icons.Default.StarBorder, "Early Bird", "10 Trips"),
		BadgeItem(Icons.Default.AccountCircle, "Photographer", "500 Photos"),
		BadgeItem(Icons.Default.CheckCircle, "Adventurer", "10 Countries"),
		BadgeItem(Icons.Default.Place, "Weekend Tripper", "20 Trips")
	)

	Column(
		modifier = modifier
			.fillMaxSize()
			.background(AppTheme.colors.background)
			.verticalScroll(scrollState)
			.widthIn(max = 430.dp)
	) {
		ProfileHero()

		Spacer(modifier = Modifier.height(12.dp))

		StatsRow(stats = stats)

		Spacer(modifier = Modifier.height(12.dp))

		SectionHeader(title = "My Journey Map", action = "View Full Map")
		JourneyMapCard()

		Spacer(modifier = Modifier.height(12.dp))

		SectionHeader(title = "My Trips", action = "View All")
		TripsRow(trips = trips)

		Spacer(modifier = Modifier.height(12.dp))

		SectionHeader(title = "Activity Summary", action = "This Year")
		ActivitySummaryCard()

		Spacer(modifier = Modifier.height(12.dp))

		SectionHeader(title = "My Badges", action = "View All")
		BadgesRow(badges = badges)

		Spacer(modifier = Modifier.height(12.dp))

		BottomNavigationPreview()

		Spacer(modifier = Modifier.height(20.dp))
	}
}

@Composable
private fun ProfileHero() {
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.height(356.dp)
	) {
		Image(
			painter = painterResource(id = R.drawable.ob4),
			contentDescription = null,
			modifier = Modifier
				.fillMaxSize()
			,
			contentScale = ContentScale.Crop
		)

		Box(
			modifier = Modifier
				.fillMaxSize()
				.background(
					Brush.verticalGradient(
						colors = listOf(
							Color.White.copy(alpha = 0.06f),
							Color.White.copy(alpha = 0.18f),
							Color.White.copy(alpha = 0.92f)
						),
						startY = 0f,
						endY = 900f
					)
				)
		)

		Box(
			modifier = Modifier
				.fillMaxWidth()
				.height(220.dp)
				.align(Alignment.BottomCenter)
				.background(
					Brush.verticalGradient(
						colors = listOf(Color.Transparent, Color.White.copy(alpha = 0.12f), Color.White)
					)
				)
		)

		Balloon(Modifier.offset(x = 18.dp, y = 52.dp), scale = 0.62f)
		Balloon(Modifier.offset(x = 330.dp, y = 34.dp), scale = 0.78f)

		Row(
			modifier = Modifier
				.fillMaxWidth()
				.padding(horizontal = 14.dp, vertical = 14.dp),
			horizontalArrangement = Arrangement.SpaceBetween
		) {
			TopGlassIcon(Icons.Default.Settings)
			Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
				TopGlassIcon(Icons.Default.Share)
				TopGlassIcon(Icons.Default.NotificationsNone, showDot = true)
			}
		}

		Column(
			modifier = Modifier
				.align(Alignment.BottomStart)
				.padding(start = 14.dp, end = 14.dp, bottom = 16.dp)
		) {
			Row(verticalAlignment = Alignment.CenterVertically) {
				Box(
					modifier = Modifier
						.size(92.dp)
						.clip(CircleShape)
						.background(Color.White.copy(alpha = 0.92f))
						.border(3.dp, Color.White.copy(alpha = 0.75f), CircleShape),
					contentAlignment = Alignment.Center
				) {
					Box(
						modifier = Modifier
							.size(78.dp)
							.clip(CircleShape)
							.background(Color(0xFFF3F7D8)),
						contentAlignment = Alignment.Center
					) {
						Text(
							text = "T",
							style = MaterialTheme.typography.headlineMedium,
							fontWeight = FontWeight.Black,
							color = Color(0xFF1E3B4D)
						)
					}

					Box(
						modifier = Modifier
							.align(Alignment.BottomEnd)
							.size(24.dp)
							.clip(CircleShape)
							.background(Color.White),
						contentAlignment = Alignment.Center
					) {
						Icon(
							imageVector = Icons.Default.Place,
							contentDescription = null,
							tint = AppTheme.colors.primary,
							modifier = Modifier.size(16.dp)
						)
					}
				}

				Spacer(modifier = Modifier.width(16.dp))

				Column(modifier = Modifier.weight(1f)) {
					Row(verticalAlignment = Alignment.CenterVertically) {
						Text(
							text = "Tai Tran",
							style = MaterialTheme.typography.headlineSmall,
							fontWeight = FontWeight.Bold,
							color = Color.White
						)
						Spacer(modifier = Modifier.width(6.dp))
						AppBadge(
							text = "Verified",
							backgroundColor = AppTheme.colors.success,
							contentColor = Color.White
						)
					}

					Spacer(modifier = Modifier.height(2.dp))

					Row(verticalAlignment = Alignment.CenterVertically) {
						Icon(
							imageVector = Icons.Default.Place,
							contentDescription = null,
							tint = Color.White.copy(alpha = 0.95f),
							modifier = Modifier.size(14.dp)
						)
						Spacer(modifier = Modifier.width(6.dp))
						Text(
							text = "Ho Chi Minh City, Vietnam",
							style = MaterialTheme.typography.bodySmall,
							color = Color.White.copy(alpha = 0.92f)
						)
					}

					Spacer(modifier = Modifier.height(6.dp))

					AppBadge(
						text = "Premium Explorer",
						backgroundColor = AppTheme.colors.success.copy(alpha = 0.9f),
						contentColor = Color.White
					)
				}
			}
		}
	}
}

@Composable
private fun TopGlassIcon(
	icon: androidx.compose.ui.graphics.vector.ImageVector,
	showDot: Boolean = false
) {
	Box(
		modifier = Modifier
			.size(42.dp)
			.clip(CircleShape)
			.background(Color.White.copy(alpha = 0.18f)),
		contentAlignment = Alignment.Center
	) {
		Icon(imageVector = icon, contentDescription = null, tint = Color.White)
		if (showDot) {
			Box(
				modifier = Modifier
					.align(Alignment.TopEnd)
					.padding(top = 8.dp, end = 10.dp)
					.size(10.dp)
					.clip(CircleShape)
					.background(AppTheme.colors.error)
			)
		}
	}
}

@Composable
private fun Balloon(modifier: Modifier = Modifier, scale: Float = 1f) {
	val sizeModifier = Modifier.size((22.dp * scale))
	Box(modifier = modifier.then(sizeModifier)) {
		Box(
			modifier = Modifier
				.fillMaxSize()
				.clip(CircleShape)
				.background(
					Brush.verticalGradient(
						colors = listOf(Color(0xFFF7B24B), Color(0xFF1F7A8C))
					)
				)
		)
		Box(
			modifier = Modifier
				.align(Alignment.BottomCenter)
				.offset(y = 16.dp)
				.size(width = 8.dp, height = 6.dp)
				.background(Color(0xFF6D4C41), RoundedCornerShape(2.dp))
		)
	}
}

@Composable
private fun StatsRow(stats: List<ProfileStat>) {
	AppCard(
		modifier = Modifier
			.fillMaxWidth()
			.padding(horizontal = 16.dp)
	) {
		Row(
			modifier = Modifier
				.fillMaxWidth()
				.padding(horizontal = 10.dp, vertical = 12.dp),
			horizontalArrangement = Arrangement.SpaceEvenly,
			verticalAlignment = Alignment.CenterVertically
		) {
			stats.forEachIndexed { index, item ->
				StatItem(item = item)
				if (index < stats.lastIndex) {
					VerticalDivider()
				}
			}
		}
	}
}

@Composable
private fun StatItem(item: ProfileStat) {
	Column(horizontalAlignment = Alignment.CenterHorizontally) {
		Box(
			modifier = Modifier
				.size(30.dp)
				.clip(CircleShape)
				.background(item.tint.copy(alpha = 0.12f)),
			contentAlignment = Alignment.Center
		) {
			Icon(imageVector = item.icon, contentDescription = null, tint = item.tint, modifier = Modifier.size(16.dp))
		}

		Spacer(modifier = Modifier.height(6.dp))

		Text(
			text = item.value,
			style = MaterialTheme.typography.titleMedium,
			fontWeight = FontWeight.Black,
			color = AppTheme.colors.textPrimary
		)
		Text(
			text = item.label,
			style = MaterialTheme.typography.bodySmall,
			color = AppTheme.colors.textSecondary
		)
	}
}

@Composable
private fun VerticalDivider() {
	Box(
		modifier = Modifier
				.width(1.dp)
				.height(48.dp)
			.background(AppTheme.colors.divider.copy(alpha = 0.6f))
	)
}

@Composable
private fun SectionHeader(title: String, action: String) {
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.padding(horizontal = 16.dp),
		horizontalArrangement = Arrangement.SpaceBetween,
		verticalAlignment = Alignment.CenterVertically
	) {
		Text(
			text = title,
			style = MaterialTheme.typography.titleSmall,
			fontWeight = FontWeight.Bold,
			color = AppTheme.colors.textPrimary
		)
		Row(verticalAlignment = Alignment.CenterVertically) {
			Text(
				text = action,
				style = MaterialTheme.typography.bodyMedium,
				color = AppTheme.colors.primary,
				fontWeight = FontWeight.SemiBold
			)
			Icon(
				imageVector = Icons.Default.ChevronRight,
				contentDescription = null,
				tint = AppTheme.colors.primary,
				modifier = Modifier.size(18.dp)
			)
		}
	}
}

@Composable
private fun JourneyMapCard() {
	AppCard(
		modifier = Modifier
			.fillMaxWidth()
			.padding(horizontal = 16.dp)
	) {
		Row(
			modifier = Modifier
				.fillMaxWidth()
				.padding(14.dp),
			horizontalArrangement = Arrangement.spacedBy(14.dp)
		) {
			Box(
				modifier = Modifier
					.weight(1.6f)
					.height(184.dp)
					.clip(RoundedCornerShape(24.dp))
			) {
				Image(
					painter = painterResource(id = R.drawable.mapoverlay),
					contentDescription = null,
					modifier = Modifier.fillMaxSize(),
					contentScale = ContentScale.Crop,
					alpha = 0.96f
				)
				Box(
					modifier = Modifier
						.fillMaxSize()
						.background(
							Brush.verticalGradient(
								colors = listOf(Color.White.copy(alpha = 0.08f), Color.White.copy(alpha = 0.4f))
							)
						)
				)
				Box(
					modifier = Modifier
						.align(Alignment.TopStart)
						.padding(12.dp)
						.clip(RoundedCornerShape(999.dp))
						.background(Color.White.copy(alpha = 0.82f))
						.border(1.dp, AppTheme.colors.primary.copy(alpha = 0.14f), RoundedCornerShape(999.dp))
						.padding(horizontal = 10.dp, vertical = 6.dp)
				) {
					Row(verticalAlignment = Alignment.CenterVertically) {
						Icon(imageVector = Icons.Default.TravelExplore, contentDescription = null, tint = AppTheme.colors.primary, modifier = Modifier.size(14.dp))
						Spacer(modifier = Modifier.width(6.dp))
						Text(text = "Visited map", style = MaterialTheme.typography.labelSmall, color = AppTheme.colors.textPrimary, fontWeight = FontWeight.SemiBold)
					}
				}

				Box(
					modifier = Modifier
						.align(Alignment.BottomStart)
						.padding(12.dp)
						.size(48.dp)
						.clip(CircleShape)
						.background(Color.White.copy(alpha = 0.9f)),
					contentAlignment = Alignment.Center
				) {
					Icon(imageVector = Icons.Default.Place, contentDescription = null, tint = AppTheme.colors.primary, modifier = Modifier.size(22.dp))
				}

				Box(
					modifier = Modifier
						.align(Alignment.BottomStart)
						.padding(start = 12.dp, end = 12.dp, bottom = 12.dp)
						.height(6.dp)
						.fillMaxWidth(0.76f)
						.clip(RoundedCornerShape(99.dp))
						.background(Color.White.copy(alpha = 0.56f))
				)
				Box(
					modifier = Modifier
						.align(Alignment.BottomStart)
						.padding(start = 12.dp, end = 12.dp, bottom = 12.dp)
						.height(6.dp)
						.fillMaxWidth(0.52f)
						.clip(RoundedCornerShape(99.dp))
						.background(AppTheme.colors.primary)
				)
			}

			Column(
				modifier = Modifier
					.weight(0.9f)
					.fillMaxHeight(),
				verticalArrangement = Arrangement.spacedBy(10.dp)
			) {
				ProfileMapStat(icon = Icons.Default.Place, title = "Countries", value = "12", tint = AppTheme.colors.primary)
				ProfileMapStat(icon = Icons.Default.Map, title = "Cities", value = "36", tint = AppTheme.colors.blue)
				ProfileMapStat(icon = Icons.Default.Flag, title = "Top", value = "Vietnam", tint = AppTheme.colors.error)
			}
		}
	}
}

@Composable
private fun ProfileMapStat(
	icon: androidx.compose.ui.graphics.vector.ImageVector,
	title: String,
	value: String,
	tint: Color
) {
	Row(verticalAlignment = Alignment.CenterVertically) {
		Box(
			modifier = Modifier
				.size(32.dp)
				.clip(CircleShape)
				.background(tint.copy(alpha = 0.12f)),
			contentAlignment = Alignment.Center
		) {
			Icon(imageVector = icon, contentDescription = null, tint = tint, modifier = Modifier.size(18.dp))
		}

		Spacer(modifier = Modifier.width(10.dp))

		Column {
			Text(text = title, style = MaterialTheme.typography.labelSmall, color = AppTheme.colors.textSecondary)
			Text(text = value, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = AppTheme.colors.textPrimary)
		}
	}
}

@Composable
private fun TripsRow(trips: List<TripCard>) {
	LazyRow(
		modifier = Modifier.fillMaxWidth(),
		contentPadding = androidx.compose.foundation.layout.PaddingValues(horizontal = 16.dp),
		horizontalArrangement = Arrangement.spacedBy(10.dp)
	) {
		items(trips) { trip ->
			TripCardItem(trip = trip)
		}
	}
}

@Composable
private fun TripCardItem(trip: TripCard) {
	AppCard(
		modifier = Modifier
			.width(156.dp)
	) {
		Column {
			Box(
				modifier = Modifier
					.fillMaxWidth()
					.height(130.dp)
					.clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
			) {
				Image(
					painter = painterResource(id = trip.imageRes),
					contentDescription = trip.title,
					modifier = Modifier.fillMaxSize(),
					contentScale = ContentScale.Crop
				)
				Box(
					modifier = Modifier
						.fillMaxSize()
						.background(
							Brush.verticalGradient(
								colors = listOf(Color.Transparent, Color(0xAA173247))
							)
						)
				)

				trip.status?.let {
					Box(
						modifier = Modifier
							.align(Alignment.TopStart)
							.padding(10.dp)
					) {
						AppBadge(
							text = it,
							backgroundColor = trip.statusColor.copy(alpha = 0.92f),
							contentColor = Color.White
						)
					}
				}
			}

				Column(modifier = Modifier.padding(12.dp)) {
					Text(text = trip.title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = AppTheme.colors.textPrimary, maxLines = 1, overflow = TextOverflow.Ellipsis)
					Spacer(modifier = Modifier.height(2.dp))
					Text(text = trip.dateRange, style = MaterialTheme.typography.labelSmall, color = AppTheme.colors.textSecondary)

					Spacer(modifier = Modifier.height(8.dp))

					Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
					SmallTripMetric(icon = Icons.Default.Route, text = trip.distance)
						SmallTripMetric(icon = Icons.Default.PhotoCamera, text = trip.photos)
				}
			}
		}
	}
}

@Composable
private fun SmallTripMetric(icon: androidx.compose.ui.graphics.vector.ImageVector, text: String) {
	Row(verticalAlignment = Alignment.CenterVertically) {
		Icon(imageVector = icon, contentDescription = null, tint = AppTheme.colors.textSecondary, modifier = Modifier.size(13.dp))
		Spacer(modifier = Modifier.width(3.dp))
		Text(text = text, style = MaterialTheme.typography.labelSmall, color = AppTheme.colors.textSecondary)
	}
}

@Composable
private fun ActivitySummaryCard() {
	AppCard(
		modifier = Modifier
			.fillMaxWidth()
			.padding(horizontal = 16.dp)
	) {
		Row(
			modifier = Modifier
				.fillMaxWidth()
				.padding(14.dp),
			horizontalArrangement = Arrangement.spacedBy(8.dp)
		) {
			SummaryMetric(icon = Icons.Default.Route, value = "1,842 km", label = "Distance", tint = AppTheme.colors.success)
			SummaryMetric(icon = Icons.Default.CheckCircle, value = "128h 45m", label = "Time", tint = AppTheme.colors.blue)
			SummaryMetric(icon = Icons.Default.Place, value = "389", label = "Check-ins", tint = AppTheme.colors.warning)
			SummaryMetric(icon = Icons.Default.PhotoCamera, value = "1,247", label = "Photos", tint = AppTheme.colors.error)
		}
	}
}

@Composable
private fun SummaryMetric(
	icon: androidx.compose.ui.graphics.vector.ImageVector,
	value: String,
	label: String,
	tint: Color
) {
	Column(horizontalAlignment = Alignment.CenterHorizontally) {
		Box(
			modifier = Modifier
				.size(28.dp)
				.clip(CircleShape)
				.background(tint.copy(alpha = 0.12f)),
			contentAlignment = Alignment.Center
		) {
			Icon(imageVector = icon, contentDescription = null, tint = tint, modifier = Modifier.size(15.dp))
		}

		Spacer(modifier = Modifier.height(6.dp))

		Text(text = value, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = AppTheme.colors.textPrimary)
		Text(text = label, style = MaterialTheme.typography.labelSmall, color = AppTheme.colors.textSecondary)
	}
}

@Composable
private fun BadgesRow(badges: List<BadgeItem>) {
	LazyRow(
		modifier = Modifier.fillMaxWidth(),
		contentPadding = androidx.compose.foundation.layout.PaddingValues(horizontal = 16.dp),
		horizontalArrangement = Arrangement.spacedBy(10.dp)
	) {
		items(badges) { badge ->
			BadgeItemView(badge = badge)
		}
	}
}

@Composable
private fun BadgeItemView(badge: BadgeItem) {
	Column(horizontalAlignment = Alignment.CenterHorizontally) {
		Box(
			modifier = Modifier
				.size(width = 140.dp, height = 72.dp)
				.clip(RoundedCornerShape(22.dp))
				.background(
					Brush.linearGradient(
						listOf(Color.White, AppTheme.colors.primary.copy(alpha = 0.12f))
					)
				)
				.border(1.dp, AppTheme.colors.primary.copy(alpha = 0.15f), RoundedCornerShape(22.dp)),
			contentAlignment = Alignment.CenterStart
		) {
			Row(
				modifier = Modifier
					.fillMaxSize()
					.padding(horizontal = 14.dp),
				verticalAlignment = Alignment.CenterVertically
			) {
				Box(
					modifier = Modifier
						.size(38.dp)
						.clip(CircleShape)
						.background(AppTheme.colors.primary.copy(alpha = 0.12f)),
					contentAlignment = Alignment.Center
				) {
					Icon(imageVector = badge.icon, contentDescription = null, tint = AppTheme.colors.primary, modifier = Modifier.size(20.dp))
				}

				Spacer(modifier = Modifier.width(10.dp))

				Column {
					Text(text = badge.title, style = MaterialTheme.typography.labelLarge, color = AppTheme.colors.textPrimary, fontWeight = FontWeight.SemiBold)
					Text(text = badge.subtitle, style = MaterialTheme.typography.labelSmall, color = AppTheme.colors.textSecondary)
				}
			}
		}
	}
}

@Composable
private fun BottomNavigationPreview() {
	AppCard(
		modifier = Modifier
			.fillMaxWidth()
			.padding(horizontal = 16.dp)
	) {
		Row(
			modifier = Modifier
				.fillMaxWidth()
				.padding(horizontal = 10.dp, vertical = 10.dp),
			horizontalArrangement = Arrangement.SpaceEvenly
		) {
			MiniNavItem("Saved Places")
			MiniNavItem("Bucket List")
			MiniNavItem("Friends")
			MiniNavItem("Following")
			MiniNavItem("Reviews")
		}
	}
}

@Composable
private fun MiniNavItem(label: String) {
	Column(horizontalAlignment = Alignment.CenterHorizontally) {
		Box(
			modifier = Modifier
				.size(28.dp)
				.clip(CircleShape)
				.background(AppTheme.colors.border.copy(alpha = 0.35f)),
			contentAlignment = Alignment.Center
		) {
			Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null, tint = AppTheme.colors.textSecondary, modifier = Modifier.size(16.dp))
		}
		Spacer(modifier = Modifier.height(6.dp))
		Text(text = label, style = MaterialTheme.typography.labelSmall, color = AppTheme.colors.textSecondary)
	}
}
