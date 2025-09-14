package com.example.coinsphere.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect // Importa SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView // Importa LocalView
import androidx.core.view.WindowCompat // Importa WindowCompat

// Define los colores para el tema oscuro usando las nuevas variables
private val DarkColorScheme = darkColorScheme(
    primary = TextMain,
    onPrimary = DarkBackground,
    secondary = DarkSurface,
    tertiary = TextDim,
    background = DarkBackground,
    surface = DarkSurface,
    onSurface = TextMain,
    onBackground = TextMain,
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Otros colores, si se necesitan */
)

@Composable
fun CoinSphereTheme(
    darkTheme: Boolean = true, // Forzamos el tema oscuro a 'true'
    dynamicColor: Boolean = false, // Desactivamos el color dinámico para usar nuestro tema
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        // En este caso, el tema dinámico no se usará porque lo desactivamos
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    // Código para cambiar el color de la barra de estado
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}