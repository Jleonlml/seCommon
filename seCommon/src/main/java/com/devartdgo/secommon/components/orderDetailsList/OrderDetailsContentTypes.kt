package com.devartdgo.secommon.components.orderDetailsList

import com.devartdgo.secommon.components.productItems.GenericProductItem
import com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon.GenericRowItemWithLabelValueAndIcon

sealed interface OrderDetailsContentTypes {
    data class ItemRow(
        val item: GenericRowItemWithLabelValueAndIcon
    ): OrderDetailsContentTypes

    data class ProductItem(
        val item: GenericProductItem
    ): OrderDetailsContentTypes

    data class SummaryItem(
        val item: GenericRowItemWithLabelValueAndIcon
    ): OrderDetailsContentTypes
}