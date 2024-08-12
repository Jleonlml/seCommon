package com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.devartdgo.secommon.components.renderableIcon.RenderableIcon
import com.devartdgo.secommon.components.renderableText.RenderableText
import com.devartdgo.secommon.layouts.RowLayout_1

@Composable
fun RowItemWith_L_Label_OptionalIcon_R_Value(
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .height(32.dp),
    text1: String,
    iconRes: Int? = null,
    iconContentDesc: String? = null,
    text2: String
) {
    RowLayout_1(
        modifier = modifier,
        content1 = {
            RenderableText(text = text1)
            iconRes?.let {
                if (iconContentDesc != null) {
                    RenderableIcon(
                        iconRes = iconRes,
                        contentDescription = iconContentDesc
                    )
                }
            }
        },
        content2 = { RenderableText(text = text2) }
    )
}