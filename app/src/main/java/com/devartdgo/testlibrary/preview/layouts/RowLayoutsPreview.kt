package com.devartdgo.testlibrary.preview.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devartdgo.secommon.components.renderableIcon.RenderableIcon
import com.devartdgo.secommon.layouts.RowLayout_1
import com.devartdgo.secommon.components.renderableText.RenderableText
import com.devartdgo.secommon.R
import com.devartdgo.secommon.layouts.RowLayout_3

@Preview
@Composable
private fun RowLayoutPreview_4() {
    Surface(Modifier.background(Color.White)) {
        RowLayout_1(
            content1 = { RenderableText(text = "Title") },
            content2 = { RenderableIcon(
                iconRes = R.drawable.ic_chevron_right,
                contentDescription = "desc"
            ) }
        )
    }
}

@Preview
@Composable
private fun RowLayoutPreview_5() {
    Surface(Modifier.background(Color.White)) {
        RowLayout_3(
            modifier = Modifier
                .fillMaxWidth(),
            content1 = {
                RenderableText(
                    modifier = Modifier.padding(end = 16.dp),
                    text = "2 X"
                )
            },
            content2 = { RenderableText(text = "Item") },
            content3 = { RenderableText(text = "Cal") },
            content4 = { RenderableText(text = "Promo") },
            content5 = { RenderableText(text = "$9.99") },
            content6 = { RenderableText(text = "$19.99") }
        )
    }
}
