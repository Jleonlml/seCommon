package com.devartdgo.secommon.components.expandableItem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.devartdgo.secommon.layouts.RowLayout_1
import com.devartdgo.secommon.components.renderableIcon.RenderableIcon
import com.devartdgo.secommon.components.renderableText.RenderableText

@Composable
fun ExpandableItem(
    title: String,
    titleTextStyle: TextStyle = LocalTextStyle.current,
    expandIcon: Int,
    isExpanded: Boolean = true,
    contentHorizontalPadding: Dp = 16.dp,
    contentVerticalPadding: Dp = 0.dp,
    dividerHorizontalPadding: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    val isExpanded = remember {
        mutableStateOf(isExpanded)
    }

    Column(
        modifier = Modifier.padding(horizontal = contentHorizontalPadding, vertical = contentVerticalPadding)
    ) {
        RowLayout_1(
            content1 = {
                RenderableText(
                    text = title,
                    style = titleTextStyle
                )
            },
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
    Divider(
        modifier = Modifier.height(8.dp).padding(horizontal = dividerHorizontalPadding),
        color = Color.Gray
    )
}