package com.devartdgo.secommon.components.renderableButton

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.devartdgo.secommon.core.Renderable
import com.devartdgo.secommon.theme.BaseTheme

@Composable
fun RenderableButton(
    onClick: () -> Unit,
    fillOrWrapContentWidth: Boolean = false,
    height: Dp = 80.dp,
    verticalPadding: Dp = 16.dp,
    horizontalPadding: Dp = 16.dp,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    content: @Composable () -> Unit
) {
    val modifier = if(fillOrWrapContentWidth) {
        Modifier.fillMaxWidth().height(height).padding(horizontal = horizontalPadding, vertical = verticalPadding)
    } else {
        Modifier.wrapContentWidth().height(height)
    }
    RenderBtn(
        modifier,
        onClick,
        colors,
        content
    )
}

@Composable
private fun RenderBtn(
    modifier: Modifier,
    onClick: () -> Unit,
    colors: ButtonColors,
    content: @Composable () -> Unit
) {
    Button(
        modifier = modifier,
        colors = colors,
        onClick = { onClick}
    ) {
        content()
    }
}