package com.devartdgo.secommon.components.expandableItem

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.devartdgo.secommon.layouts.RowLayout_1
import com.devartdgo.secommon.components.renderableIcon.RenderableIcon
import com.devartdgo.secommon.components.renderableText.RenderableText

@Composable
fun ExpandableItem(
    title: String,
    expandIcon: Int,
    isExpanded: Boolean = true,
    content: @Composable () -> Unit
) {
    val isExpanded = remember {
        mutableStateOf(isExpanded)
    }

    Column {
        RowLayout_1(
            modifier = Modifier
                .fillMaxWidth()
                .height(32.dp),
            content1 = { RenderableText(text = title) },
            content2 = {
                RenderableIcon(
                    iconRes = expandIcon,
                    contentDescription = "desc",
                    isClickable = true,
                    onClick = {
                        isExpanded.value = !isExpanded.value
                    }
                )
            }
        )

        if (isExpanded.value) {
            content()
        }
    }
}