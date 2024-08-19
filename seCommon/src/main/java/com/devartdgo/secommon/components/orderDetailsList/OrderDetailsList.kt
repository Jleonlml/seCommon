package com.devartdgo.secommon.components.orderDetailsList

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.devartdgo.secommon.R
import com.devartdgo.secommon.components.expandableItem.ExpandableItem

@Composable
fun orderDetailsList(
    modifier: Modifier = Modifier,
    sectionContentVerticalPadding: Dp = 0.dp,
    sectionContentHorizontalPadding: Dp = 16.dp,
    dividerHorizontalPAdding: Dp = 0.dp,
    sectionsTitleTextStyle: TextStyle = LocalTextStyle.current,
    sections: List<GenericOrderDetailsSection>
) {
    LazyColumn(modifier) {
        items(sections) {
            ExpandableItem(
                title = it.title,
                titleTextStyle = sectionsTitleTextStyle,
                expandIcon = R.drawable.ic_chevron_right,
                isExpanded = true,
                content = {
                    it.contents.forEach { contentType ->
                        OrderDetailContentSwitch(contentType = contentType)
                    }
                },
                contentHorizontalPadding = sectionContentHorizontalPadding,
                contentVerticalPadding = sectionContentVerticalPadding,
                dividerHorizontalPadding = dividerHorizontalPAdding
            )
        }
    }
}