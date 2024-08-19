package com.devartdgo.testlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devartdgo.secommon.R
import com.devartdgo.secommon.components.orderDetailsList.GenericOrderDetailsSection
import com.devartdgo.secommon.components.orderDetailsList.OrderDetailsContentTypes
import com.devartdgo.secommon.components.orderDetailsList.orderDetailsList
import com.devartdgo.secommon.components.productItems.GenericProductItem
import com.devartdgo.secommon.components.renderableButton.RenderableButton
import com.devartdgo.secommon.components.renderableIcon.RenderableIcon
import com.devartdgo.secommon.components.renderableText.RenderableText
import com.devartdgo.secommon.components.rowItemWithLabelValueAndIcon.GenericRowItemWithLabelValueAndIcon
import com.devartdgo.secommon.components.screenHeader.ScreenHeaderLayout
import com.devartdgo.secommon.theme.BaseTheme
import com.devartdgo.secommon.theme.ThemeEnum

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BaseTheme(
                theme = ThemeEnum.THEME1
            ).apply {
                RenderTheme() {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        MainComp(this)
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainComp(theme: BaseTheme) {
    val imageUrl = "https://farm3.staticflickr.com/2220/1572613671_7311098b76_z_d.jpg"
    Scaffold(
        topBar = {
            ScreenHeaderLayout(
                startItem = {
                    RenderableIcon(
                        iconRes = R.drawable.ic_chevron_left,
                        contentDescription = "desc",
                        isClickable = true,
                        onClick = {}
                    )
                }, endItem = {
                    RenderableIcon(
                        iconRes = R.drawable.ic_close,
                        contentDescription = "desc",
                        isClickable = true,
                        onClick = {}
                    )
                },
                headerText = "Header",
                headerTextStyle = theme.Typography.headlineLarge
            )
        }
    ) {
        Column {
            orderDetailsList(
                modifier = Modifier.padding(it),
                sectionsTitleTextStyle = theme.Typography.headlineMedium,
                sections = listOf(
                    GenericOrderDetailsSection(
                        title = "Order Details",
                        contents = listOf(
                            OrderDetailsContentTypes.ItemRow(
                                item = GenericRowItemWithLabelValueAndIcon(
                                    text1 = "Status",
                                    text2 = "Completed",
                                    icon = R.drawable.ic_check
                                )
                            ),
                            OrderDetailsContentTypes.ItemRow(
                                item = GenericRowItemWithLabelValueAndIcon(
                                    text1 = "OrderId",
                                    text2 = "Id",
                                )
                            ),
                            OrderDetailsContentTypes.ItemRow(
                                item = GenericRowItemWithLabelValueAndIcon(
                                    text1 = "Date",
                                    text2 = "date",
                                )
                            )
                        )
                    ),
                    GenericOrderDetailsSection(
                        title = "Delivery Details",
                        contents = listOf(
                            OrderDetailsContentTypes.ItemRow(
                                item = GenericRowItemWithLabelValueAndIcon(
                                    text1 = "Delivery Address",
                                    text2 = "Address",
                                )
                            ),
                            OrderDetailsContentTypes.ItemRow(
                                item = GenericRowItemWithLabelValueAndIcon(
                                    text1 = "Instructions",
                                    text2 = "Leave at Door",
                                )
                            )
                        )
                    ),
                    GenericOrderDetailsSection(
                        title = "Purchased Items",
                        contents = listOf(
                            OrderDetailsContentTypes.ProductItem(
                                item = GenericProductItem(
                                    quantity = 2,
                                    productName = "product1",
                                    caloriesOrModifiersStr = "240 cal",
                                    discountPrice = "$9.99",
                                    price = "19.99"
                                )
                            ),
                            OrderDetailsContentTypes.ProductItem(
                                item = GenericProductItem(
                                    quantity = 1,
                                    productName = "product2",
                                    caloriesOrModifiersStr = "240 cal",
                                    discountPrice = "$9.99",
                                    price = "19.99"
                                )
                            )
                        )
                    ),
                    GenericOrderDetailsSection(
                        title = "Summary",
                        contents = listOf(
                            OrderDetailsContentTypes.SummaryItem(
                                item = GenericRowItemWithLabelValueAndIcon(
                                    text1 = "Subtotal",
                                    text2 = "$19.99",
                                )
                            ),
                            OrderDetailsContentTypes.SummaryItem(
                                item = GenericRowItemWithLabelValueAndIcon(
                                    text1 = "Savings",
                                    text2 = "$4.99",
                                )
                            ),
                            OrderDetailsContentTypes.SummaryItem(
                                item = GenericRowItemWithLabelValueAndIcon(
                                    text1 = "Total",
                                    text2 = "$15.00",
                                )
                            )
                        )
                    )
                )
            )

            RenderableButton(
                onClick = { },
                fillOrWrapContentWidth = true
            ) {
              RenderableText(
                  text = "button",
                  textColor = theme.ButtonTextColor
              )
            }
        }
    }
}