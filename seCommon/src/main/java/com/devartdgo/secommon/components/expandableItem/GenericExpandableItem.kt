package com.devartdgo.secommon.components.expandableItem

import androidx.compose.runtime.Composable

data class GenericExpandableItem (
    val title: String,
    val expandIcon: Int,
    val isExpanded: Boolean = true,
    val content: @Composable () -> Unit
)