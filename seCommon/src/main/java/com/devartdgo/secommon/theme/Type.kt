package com.devartdgo.secommon.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.devartdgo.secommon.R

// Set of Material typography styles to start with
val grotesqueFamily = FontFamily(
    Font(R.font.basis_grotesque_arabic_pro_black, FontWeight.Black),
    Font(R.font.basis_grotesque_arabic_pro__bold, FontWeight.Bold),
    Font(R.font.basis_grotesque_arabic_pro_regular, FontWeight.Normal),
    Font(R.font.basis_grotesque_arabic_pro_light, FontWeight.Light),
    Font(R.font.basis_grotesque_arabic_pr_medium, FontWeight.Medium),
)

val Theme1Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = grotesqueFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = theme1TextColor
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = theme1TextColor
    ),
    headlineLarge = TextStyle(
        fontFamily =  grotesqueFamily,
        fontWeight = FontWeight.Black,
        fontSize = 32.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = theme1TextColor
    ),
    headlineMedium = TextStyle(
        fontFamily =  grotesqueFamily,
        fontWeight = FontWeight.Black,
        fontSize = 24.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = theme1TextColor
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val Theme2Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = theme2TextColor
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = theme2TextColor
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)