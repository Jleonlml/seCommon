package com.devartdgo.testlibrary.preview.components.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.devartdgo.secommon.components.renderableButton.RenderableButton
import com.devartdgo.secommon.components.renderableText.RenderableText

@Preview
@Composable
fun Button_1_Preview() {
    RenderableButton(
        onClick = { },
        fillOrWrapContentWidth = true
    ) {
        RenderableText(
            text = "button",
            textColor = Color.Black //use theme color instead  (theme.ButtonTextColor)
        )
    }
}