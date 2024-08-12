package com.devartdgo.testlibrary.preview.components.rowItems

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devartdgo.secommon.R
import com.devartdgo.secommon.components.productItems.ProductItemWith_L_1Value_3ValuesColumn_R_2ValuesColumn
import com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon.RowItemWith_L_Label_OptionalIcon_R_Value
import com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon.RowItemWith_L_Label_R_Value_OptionalIcon

@Preview
@Composable
private fun RowItemWithLabelValueAndOptionalIcon_1_Preview() {
    Surface(Modifier.background(Color.White)) {
        RowItemWith_L_Label_R_Value_OptionalIcon(
            text1 = "Status",
            text2 = "Completed",
            iconRes = R.drawable.ic_check,
            iconContentDesc = "desc"
        )
    }
}

@Preview
@Composable
private fun RowItemWithLabelValueAndOptionalIcon_2_Preview() {
    Surface(Modifier.background(Color.White)) {
        RowItemWith_L_Label_R_Value_OptionalIcon(
            text1 = "Status",
            text2 = "Delivered",
        )
    }
}

@Preview
@Composable
private fun RowItemWithLabelValueAndOptionalIcon_3_Preview() {
    Surface(Modifier.background(Color.White)) {
        RowItemWith_L_Label_R_Value_OptionalIcon(
            text1 = "Label",
            text2 = "Value",
        )
    }
}

@Preview
@Composable
private fun RowItemWithLabelOptionalIconAndValue_1_Preview() {
    Surface(Modifier.background(Color.White)) {
        RowItemWith_L_Label_OptionalIcon_R_Value(
            modifier = Modifier
                .fillMaxWidth()
                .height(32.dp),
            text1 = "Fees",
            iconRes = R.drawable.ic_chevron_right,
            iconContentDesc = "desc",
            text2 = "$9.99"
        )
    }
}

@Preview
@Composable
private fun RowItemWithLabelOptionalIconAndValue_2_Preview() {
    Surface(Modifier.background(Color.White)) {
        RowItemWith_L_Label_OptionalIcon_R_Value(
            text1 = "Title",
            text2 = "$9.99"
        )
    }
}

@Preview
@Composable
private fun ProductItem_1_Preview() {
    Surface(Modifier.background(Color.White)) {
        ProductItemWith_L_1Value_3ValuesColumn_R_2ValuesColumn(
            quantity = 2,
            productName = "product",
            caloriesOrModifiersStr = "240 cal",
            promoStr = "promo",
            discountPrice = "9.99",
            price = "19.99"
        )
    }
}

@Preview
@Composable
private fun ProductItem_1_No_Promo_Preview() {
    Surface(Modifier.background(Color.White)) {
        ProductItemWith_L_1Value_3ValuesColumn_R_2ValuesColumn(
            quantity = 2,
            productName = "product",
            caloriesOrModifiersStr = "240 cal",
            discountPrice = "9.99",
            price = "19.99"
        )
    }
}