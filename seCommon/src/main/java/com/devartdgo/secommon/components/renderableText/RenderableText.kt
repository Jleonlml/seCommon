package com.devartdgo.secommon.components.renderableText

import androidx.compose.material3.Button
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import com.devartdgo.secommon.core.Renderable

@Composable
fun RenderableText(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = Color.Unspecified,
    style: TextStyle = LocalTextStyle.current,
) {
    RenderText(
        modifier = modifier,
        text = text,
        textColor = textColor,
        style = style
    )
}

@Composable
fun RenderText(
    modifier: Modifier,
    text: String,
    textColor: Color,
    style: TextStyle
) {
    Text(
        modifier = modifier,
        text = text,
        color = textColor,
        style = style
    )
}