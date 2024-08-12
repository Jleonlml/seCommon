package com.devartdgo.secommon.layouts

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun RowLayout_3(
    modifier: Modifier,
    content1: @Composable () -> Unit,
    content2: @Composable () -> Unit,
    content3: @Composable () -> Unit,
    content4: @Composable () -> Unit,
    content5: @Composable () -> Unit,
    content6: @Composable () -> Unit
) {
    RowLayout_2(
        modifier = modifier,
        content1 = {
            content1()
        },
        content2 = {
            Column {
                content2()
                content3()
                content4()
            }
        },
        content3 = {
            Column(horizontalAlignment = Alignment.End) {
                content5()
                content6()
            }
        }
    )
}