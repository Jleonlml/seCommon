package com.devartdgo.secommon.components.productItems

data class GenericProductItem(
    val quantity: Int,
    val productName: String,
    val caloriesOrModifiersStr: String,
    val promoStr: String? = null,
    val discountPrice: String,
    val price: String
)
