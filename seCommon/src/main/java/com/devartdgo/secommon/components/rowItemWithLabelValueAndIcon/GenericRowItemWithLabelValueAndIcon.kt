package com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class GenericRowItemWithLabelValueAndIcon(
    val modifier: Modifier = Modifier
        .fillMaxWidth()
        .height(32.dp),
    val text1: String,
    val text2: String,
    val icon: Int? = null,
    val iconContentDesc: String? = null
)
