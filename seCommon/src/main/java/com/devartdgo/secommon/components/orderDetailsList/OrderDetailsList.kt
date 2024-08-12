package com.devartdgo.secommon.components.orderDetailsList

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.devartdgo.secommon.R
import com.devartdgo.secommon.components.expandableItem.ExpandableItem

@Composable
fun orderDetailsList(
    sections: List<GenericOrderDetailsSection>
) {
    LazyColumn() {
        items(sections) {
            ExpandableItem(
                title = it.title,
                expandIcon = R.drawable.ic_chevron_right,
                isExpanded = true,
                content = {
                    it.contents.forEach { contentType ->
                        OrderDetailContentSwitch(contentType = contentType)
                    }
                }
            )
        }
    }
}