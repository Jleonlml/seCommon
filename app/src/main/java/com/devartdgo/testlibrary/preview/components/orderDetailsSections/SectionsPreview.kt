package com.devartdgo.testlibrary.preview.components.orderDetailsSections

import androidx.compose.foundation.background
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.devartdgo.secommon.R
import com.devartdgo.secommon.components.expandableItem.ExpandableItem
import com.devartdgo.secommon.components.productItems.GenericProductItem
import com.devartdgo.secommon.components.productItems.ProductItemWith_L_1Value_3ValuesColumn_R_2ValuesColumn
import com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon.GenericRowItemWithLabelValueAndIcon
import com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon.RowItemWith_L_Label_OptionalIcon_R_Value
import com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon.RowItemWith_L_Label_R_Value_OptionalIcon

@Preview
@Composable
fun OrderDetailsSectionPreview() {
    val items = listOf(
        GenericRowItemWithLabelValueAndIcon(
            text1 = "Status",
            text2 = "Completed",
            icon = R.drawable.ic_check,
            iconContentDesc = "desc"
        ),
        GenericRowItemWithLabelValueAndIcon(
            text1 = "OrderId",
            text2 = "Completed"
        ),
        GenericRowItemWithLabelValueAndIcon(
            text1 = "Date",
            text2 = "Some date"
        )
    )
    Surface(Modifier.background(Color.White)) {
        ExpandableItem(
            title = "Order Details",
            expandIcon = R.drawable.ic_chevron_right) {

            items.forEach {
                RowItemWith_L_Label_R_Value_OptionalIcon(
                    text1 = it.text1,
                    text2 = it.text2,
                    iconRes = it.icon,
                    iconContentDesc = it.iconContentDesc
                )
            }
        }
    }
}

@Preview
@Composable
fun DeliverySectionPreview() {
    val items = listOf(
        GenericRowItemWithLabelValueAndIcon(
            text1 = "Delivery Address",
            text2 = "Some Address"
        ),
        GenericRowItemWithLabelValueAndIcon(
            text1 = "Delivery Instructions",
            text2 = "Leave at door"
        )
    )
    Surface(Modifier.background(Color.White)) {
        ExpandableItem(
            title = "Delivery Details",
            expandIcon = R.drawable.ic_chevron_right) {

            items.forEach {
                RowItemWith_L_Label_R_Value_OptionalIcon(
                    text1 = it.text1,
                    text2 = it.text2,
                    iconRes = it.icon,
                    iconContentDesc = it.iconContentDesc
                )
            }
        }
    }
}

@Preview
@Composable
fun PickupSectionPreview() {
    val items = listOf(
        GenericRowItemWithLabelValueAndIcon(
            text1 = "Pickup Address",
            text2 = "Some Address"
        ),
        GenericRowItemWithLabelValueAndIcon(
            text1 = "Pickup by",
            text2 = "Time"
        )
    )
    Surface(Modifier.background(Color.White)) {
        ExpandableItem(
            title = "Pickup Details",
            expandIcon = R.drawable.ic_chevron_right) {

            items.forEach {
                RowItemWith_L_Label_R_Value_OptionalIcon(
                    text1 = it.text1,
                    text2 = it.text2,
                    iconRes = it.icon,
                    iconContentDesc = it.iconContentDesc
                )
            }
        }
    }
}

@Preview
@Composable
fun PurchasedProductsSectionPreview() {
    val items = listOf(
        GenericProductItem(
            quantity = 2,
            productName = "product1",
            caloriesOrModifiersStr = "240 cal",
            promoStr = "promo",
            discountPrice = "$19.99",
            price = "9.99"
        ),
        GenericProductItem(
            quantity = 1,
            productName = "product2",
            caloriesOrModifiersStr = "240 cal",
            discountPrice = "$19.99",
            price = "9.99"
        )
    )
    Surface(Modifier.background(Color.White)) {
        ExpandableItem(
            title = "Purchased Items",
            expandIcon = R.drawable.ic_chevron_right) {

            items.forEach {
                ProductItemWith_L_1Value_3ValuesColumn_R_2ValuesColumn(
                    quantity = it.quantity,
                    productName = it.productName,
                    caloriesOrModifiersStr = it.caloriesOrModifiersStr,
                    promoStr = it.promoStr,
                    discountPrice = it.discountPrice,
                    price = it.price
                )
            }
        }
    }
}

@Preview
@Composable
fun SummarySectionPreview() {
    val items = listOf(
        GenericRowItemWithLabelValueAndIcon(
            text1 = "Subtotal",
            text2 = "$14.99"
        ),
        GenericRowItemWithLabelValueAndIcon(
            text1 = "Fees",
            text2 = "$7.00",
            icon = R.drawable.ic_se_android,
            iconContentDesc = "desc"
        ),
        GenericRowItemWithLabelValueAndIcon(
            text1 = "Savings",
            text2 = "$2.00"
        ),
        GenericRowItemWithLabelValueAndIcon(
            text1 = "Total",
            text2 = "$19.99"
        )
    )
    Surface(Modifier.background(Color.White)) {
        ExpandableItem(
            title = "Summary",
            expandIcon = R.drawable.ic_chevron_right) {

            items.forEach {
                RowItemWith_L_Label_OptionalIcon_R_Value(
                    text1 = it.text1,
                    text2 = it.text2,
                    iconRes = it.icon,
                    iconContentDesc = it.iconContentDesc
                )
            }
        }
    }
}