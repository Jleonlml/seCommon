package com.devartdgo.secommon.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

enum class ThemeEnum (
    val darkScheme: ColorScheme,
    val lightScheme: ColorScheme,
    val typography: Typography,
    val buttonTextColor: Color
) {
    THEME1(
        darkColorScheme(
            primary = Purple80,
            secondary = PurpleGrey80,
            tertiary = Pink80
        ),
        lightColorScheme(
            primary = Purple40,
            secondary = PurpleGrey40,
            tertiary = Pink40
        ),
        typography = Theme1Typography,
        buttonTextColor = theme1ButtonTextColor,
    ),
    THEME2(
        darkColorScheme(
            primary = PurpleGrey80,
            secondary = PurpleGrey80,
            tertiary = Pink80
        ),
        lightColorScheme(
            primary = PurpleGrey40,
            secondary = PurpleGrey40,
            tertiary = Pink40
        ),
        typography = Theme2Typography,
        theme2ButtonTextColor
    )
}