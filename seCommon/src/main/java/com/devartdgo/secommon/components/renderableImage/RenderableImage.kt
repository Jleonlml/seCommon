package com.devartdgo.secommon.components.renderableImage

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.devartdgo.secommon.core.Renderable

class RenderableImage(
    val imgRes: Int,
    val contentDescription: String
): Renderable {
    @Composable
    override fun Render() {
        Image(
            painter = painterResource(id = imgRes),
            contentDescription = contentDescription
        )
    }
}