package com.devartdgo.secommon.components.renderableAsyncImage

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.devartdgo.secommon.R
import com.devartdgo.secommon.core.Renderable

class RenderableAsyncImage(
    val imageUrl: String,
    val contentDescription: String
): Renderable {
    @Composable
    override fun Render() {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(imageUrl)
                .crossfade(true)
                .build(),
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.colorMatrix(colorMatrix = ColorMatrix()),
            error = painterResource(id = R.drawable.ic_se_android)
        )
    }
}