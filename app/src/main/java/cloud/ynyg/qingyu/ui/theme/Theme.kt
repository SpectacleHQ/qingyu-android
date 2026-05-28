package cloud.ynyg.qingyu.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

/** 深色主题配色。 */
private val DarkColorScheme = darkColorScheme(
    primary = QingyuDarkPrimary,
    onPrimary = QingyuDarkOnPrimary,
    primaryContainer = QingyuDarkPrimaryContainer,
    onPrimaryContainer = QingyuDarkOnPrimaryContainer,
    secondary = QingyuDarkSecondary,
    onSecondary = QingyuDarkOnSecondary,
    secondaryContainer = QingyuDarkSecondaryContainer,
    onSecondaryContainer = QingyuDarkOnSecondaryContainer,
    tertiary = QingyuDarkTertiary,
    onTertiary = QingyuDarkOnTertiary,
    tertiaryContainer = QingyuDarkTertiaryContainer,
    onTertiaryContainer = QingyuDarkOnTertiaryContainer,
    background = QingyuDarkBackground,
    onBackground = QingyuDarkOnBackground,
    surface = QingyuDarkSurface,
    onSurface = QingyuDarkOnBackground,
    surfaceVariant = QingyuDarkSurfaceVariant,
    onSurfaceVariant = QingyuDarkOnSurfaceVariant,
    surfaceContainer = QingyuDarkSurfaceContainer,
    outline = QingyuDarkOutline,
    outlineVariant = QingyuDarkOutlineVariant,
    error = QingyuDarkError,
    onError = QingyuDarkOnError,
    errorContainer = QingyuDarkErrorContainer,
    onErrorContainer = QingyuDarkOnErrorContainer
)

/** 浅色主题配色。 */
private val LightColorScheme = lightColorScheme(
    primary = QingyuLightPrimary,
    onPrimary = QingyuLightOnPrimary,
    primaryContainer = QingyuLightPrimaryContainer,
    onPrimaryContainer = QingyuLightOnPrimaryContainer,
    secondary = QingyuLightSecondary,
    onSecondary = QingyuLightOnSecondary,
    secondaryContainer = QingyuLightSecondaryContainer,
    onSecondaryContainer = QingyuLightOnSecondaryContainer,
    tertiary = QingyuLightTertiary,
    onTertiary = QingyuLightOnTertiary,
    tertiaryContainer = QingyuLightTertiaryContainer,
    onTertiaryContainer = QingyuLightOnTertiaryContainer,
    background = QingyuLightBackground,
    onBackground = QingyuLightOnBackground,
    surface = QingyuLightSurface,
    onSurface = QingyuLightOnBackground,
    surfaceVariant = QingyuLightSurfaceVariant,
    onSurfaceVariant = QingyuLightOnSurfaceVariant,
    surfaceContainer = QingyuLightSurfaceContainer,
    outline = QingyuLightOutline,
    outlineVariant = QingyuLightOutlineVariant,
    error = QingyuLightError,
    onError = QingyuLightOnError,
    errorContainer = QingyuLightErrorContainer,
    onErrorContainer = QingyuLightOnErrorContainer
)

/** 提供应用统一的 Material 主题。 */
@Composable
fun QingyuTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    /** 是否启用系统动态取色。 */
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    /** 当前界面使用的颜色方案。 */
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
