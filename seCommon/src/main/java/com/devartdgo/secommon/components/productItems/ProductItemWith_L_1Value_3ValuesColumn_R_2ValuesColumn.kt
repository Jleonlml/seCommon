package com.devartdgo.secommon.components.productItems

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.devartdgo.secommon.components.renderableText.RenderableText
import com.devartdgo.secommon.layouts.RowLayout_3

@Composable
fun ProductItemWith_L_1Value_3ValuesColumn_R_2ValuesColumn(
    modifier: Modifier = Modifier.fillMaxWidth(),
    quantity: Int,
    productName: String,
    caloriesOrModifiersStr: String,
    promoStr: String? = null,
    discountPrice: String,
    price: String

) {
    RowLayout_3(
        modifier = modifier,
        content1 = {
            RenderableText(
                modifier = Modifier.padding(end = 16.dp),
                text = "$quantity X"
            )
        },
        content2 = { RenderableText(text = productName) },
        content3 = { RenderableText(text = caloriesOrModifiersStr) },
        content4 = { if (!promoStr.isNullOrEmpty())  RenderableText(text = promoStr) },
        content5 = { RenderableText(text = discountPrice) },
        content6 = { RenderableText(text = price) }
    )
}