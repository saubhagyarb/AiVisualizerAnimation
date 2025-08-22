package com.example.reply.ui.theme
import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = _root_ide_package_.com.example.reply.ui.theme.surfaceVariantLight,
    onSurfaceVariant = _root_ide_package_.com.example.reply.ui.theme.onSurfaceVariantLight,
    outline = _root_ide_package_.com.example.reply.ui.theme.outlineLight,
    outlineVariant = _root_ide_package_.com.example.reply.ui.theme.outlineVariantLight,
    scrim = _root_ide_package_.com.example.reply.ui.theme.scrimLight,
    inverseSurface = _root_ide_package_.com.example.reply.ui.theme.inverseSurfaceLight,
    inverseOnSurface = _root_ide_package_.com.example.reply.ui.theme.inverseOnSurfaceLight,
    inversePrimary = _root_ide_package_.com.example.reply.ui.theme.inversePrimaryLight
)

private val darkScheme = darkColorScheme(
    primary = _root_ide_package_.com.example.reply.ui.theme.primaryDark,
    onPrimary = _root_ide_package_.com.example.reply.ui.theme.onPrimaryDark,
    primaryContainer = _root_ide_package_.com.example.reply.ui.theme.primaryContainerDark,
    onPrimaryContainer = _root_ide_package_.com.example.reply.ui.theme.onPrimaryContainerDark,
    secondary = _root_ide_package_.com.example.reply.ui.theme.secondaryDark,
    onSecondary = _root_ide_package_.com.example.reply.ui.theme.onSecondaryDark,
    secondaryContainer = _root_ide_package_.com.example.reply.ui.theme.secondaryContainerDark,
    onSecondaryContainer = _root_ide_package_.com.example.reply.ui.theme.onSecondaryContainerDark,
    tertiary = _root_ide_package_.com.example.reply.ui.theme.tertiaryDark,
    onTertiary = _root_ide_package_.com.example.reply.ui.theme.onTertiaryDark,
    tertiaryContainer = _root_ide_package_.com.example.reply.ui.theme.tertiaryContainerDark,
    onTertiaryContainer = _root_ide_package_.com.example.reply.ui.theme.onTertiaryContainerDark,
    error = _root_ide_package_.com.example.reply.ui.theme.errorDark,
    onError = _root_ide_package_.com.example.reply.ui.theme.onErrorDark,
    errorContainer = _root_ide_package_.com.example.reply.ui.theme.errorContainerDark,
    onErrorContainer = _root_ide_package_.com.example.reply.ui.theme.onErrorContainerDark,
    background = _root_ide_package_.com.example.reply.ui.theme.backgroundDark,
    onBackground = _root_ide_package_.com.example.reply.ui.theme.onBackgroundDark,
    surface = _root_ide_package_.com.example.reply.ui.theme.surfaceDark,
    onSurface = _root_ide_package_.com.example.reply.ui.theme.onSurfaceDark,
    surfaceVariant = _root_ide_package_.com.example.reply.ui.theme.surfaceVariantDark,
    onSurfaceVariant = _root_ide_package_.com.example.reply.ui.theme.onSurfaceVariantDark,
    outline = _root_ide_package_.com.example.reply.ui.theme.outlineDark,
    outlineVariant = _root_ide_package_.com.example.reply.ui.theme.outlineVariantDark,
    scrim = _root_ide_package_.com.example.reply.ui.theme.scrimDark,
    inverseSurface = _root_ide_package_.com.example.reply.ui.theme.inverseSurfaceDark,
    inverseOnSurface = _root_ide_package_.com.example.reply.ui.theme.inverseOnSurfaceDark,
    inversePrimary = _root_ide_package_.com.example.reply.ui.theme.inversePrimaryDark
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = _root_ide_package_.com.example.reply.ui.theme.primaryLightMediumContrast,
    onPrimary = _root_ide_package_.com.example.reply.ui.theme.onPrimaryLightMediumContrast,
    primaryContainer = _root_ide_package_.com.example.reply.ui.theme.primaryContainerLightMediumContrast,
    onPrimaryContainer = _root_ide_package_.com.example.reply.ui.theme.onPrimaryContainerLightMediumContrast,
    secondary = _root_ide_package_.com.example.reply.ui.theme.secondaryLightMediumContrast,
    onSecondary = _root_ide_package_.com.example.reply.ui.theme.onSecondaryLightMediumContrast,
    secondaryContainer = _root_ide_package_.com.example.reply.ui.theme.secondaryContainerLightMediumContrast,
    onSecondaryContainer = _root_ide_package_.com.example.reply.ui.theme.onSecondaryContainerLightMediumContrast,
    tertiary = _root_ide_package_.com.example.reply.ui.theme.tertiaryLightMediumContrast,
    onTertiary = _root_ide_package_.com.example.reply.ui.theme.onTertiaryLightMediumContrast,
    tertiaryContainer = _root_ide_package_.com.example.reply.ui.theme.tertiaryContainerLightMediumContrast,
    onTertiaryContainer = _root_ide_package_.com.example.reply.ui.theme.onTertiaryContainerLightMediumContrast,
    error = _root_ide_package_.com.example.reply.ui.theme.errorLightMediumContrast,
    onError = _root_ide_package_.com.example.reply.ui.theme.onErrorLightMediumContrast,
    errorContainer = _root_ide_package_.com.example.reply.ui.theme.errorContainerLightMediumContrast,
    onErrorContainer = _root_ide_package_.com.example.reply.ui.theme.onErrorContainerLightMediumContrast,
    background = _root_ide_package_.com.example.reply.ui.theme.backgroundLightMediumContrast,
    onBackground = _root_ide_package_.com.example.reply.ui.theme.onBackgroundLightMediumContrast,
    surface = _root_ide_package_.com.example.reply.ui.theme.surfaceLightMediumContrast,
    onSurface = _root_ide_package_.com.example.reply.ui.theme.onSurfaceLightMediumContrast,
    surfaceVariant = _root_ide_package_.com.example.reply.ui.theme.surfaceVariantLightMediumContrast,
    onSurfaceVariant = _root_ide_package_.com.example.reply.ui.theme.onSurfaceVariantLightMediumContrast,
    outline = _root_ide_package_.com.example.reply.ui.theme.outlineLightMediumContrast,
    outlineVariant = _root_ide_package_.com.example.reply.ui.theme.outlineVariantLightMediumContrast,
    scrim = _root_ide_package_.com.example.reply.ui.theme.scrimLightMediumContrast,
    inverseSurface = _root_ide_package_.com.example.reply.ui.theme.inverseSurfaceLightMediumContrast,
    inverseOnSurface = _root_ide_package_.com.example.reply.ui.theme.inverseOnSurfaceLightMediumContrast,
    inversePrimary = _root_ide_package_.com.example.reply.ui.theme.inversePrimaryLightMediumContrast
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = _root_ide_package_.com.example.reply.ui.theme.primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun ReplyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable() () -> Unit
) {
  val colorScheme = when {
      dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
          val context = LocalContext.current
          if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
      }
      
      darkTheme -> mediumContrastDarkColorScheme
      else ->mediumContrastDarkColorScheme
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = AppTypography,
    content = content
  )
}

