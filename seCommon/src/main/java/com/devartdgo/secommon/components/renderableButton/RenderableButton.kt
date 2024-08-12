package com.devartdgo.secommon.components.renderableButton

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import com.devartdgo.secommon.core.Renderable
import com.devartdgo.secommon.theme.BaseTheme

@Composable
fun RenderableButton(
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    RenderBtn(onClick, content)
}

@Composable
private fun RenderBtn(onClick: () -> Unit, content: @Composable () -> Unit) {
    Button(onClick = { /*TODO*/ }) {
        content()
    }
}