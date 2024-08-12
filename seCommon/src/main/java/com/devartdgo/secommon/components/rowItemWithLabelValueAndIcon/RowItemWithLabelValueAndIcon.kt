package com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.devartdgo.secommon.layouts.RowLayout_1
import com.devartdgo.secommon.components.renderableIcon.RenderableIcon
import com.devartdgo.secommon.components.renderableText.RenderableText

@Composable
fun RowItemWith_L_Label_R_Value_OptionalIcon(
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .height(32.dp),
    text1: String,
    text2: String,
    iconRes: Int? = null,
    iconContentDesc: String? = null
) {
    RowLayout_1(
        modifier = modifier,
        content1 = { RenderableText(text = text1) },
        content2 = {
            RenderableText(text = text2)
            iconRes?.let {
                if (iconContentDesc != null) {
                    RenderableIcon(
                        iconRes = iconRes,
                        contentDescription = iconContentDesc
                    )
                }
            }
        }
    )
}
