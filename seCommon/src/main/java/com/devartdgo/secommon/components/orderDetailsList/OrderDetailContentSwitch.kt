package com.devartdgo.secommon.components.orderDetailsList

import androidx.compose.runtime.Composable
import com.devartdgo.secommon.components.productItems.ProductItemWith_L_1Value_3ValuesColumn_R_2ValuesColumn
import com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon.RowItemWith_L_Label_OptionalIcon_R_Value
import com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon.RowItemWith_L_Label_R_Value_OptionalIcon

@Composable
fun OrderDetailContentSwitch(
    contentType: OrderDetailsContentTypes
) {
    when(contentType) {
        is OrderDetailsContentTypes.ItemRow -> {
            RowItemWith_L_Label_R_Value_OptionalIcon(
                text1 = contentType.item.text1,
                text2 = contentType.item.text2,
                iconRes = contentType.item.icon,
                iconContentDesc = contentType.item.iconContentDesc
            )
        }
        is OrderDetailsContentTypes.ProductItem -> {
            ProductItemWith_L_1Value_3ValuesColumn_R_2ValuesColumn(
                quantity = contentType.item.quantity,
                productName = contentType.item.productName,
                caloriesOrModifiersStr = contentType.item.caloriesOrModifiersStr,
                promoStr = contentType.item.promoStr,
                discountPrice = contentType.item.discountPrice,
                price = contentType.item.price
            )
        }
        is OrderDetailsContentTypes.SummaryItem -> {
            RowItemWith_L_Label_OptionalIcon_R_Value(
                text1 = contentType.item.text1,
                iconRes = contentType.item.icon,
                iconContentDesc = contentType.item.iconContentDesc,
                text2 = contentType.item.text2
            )
        }
    }
}