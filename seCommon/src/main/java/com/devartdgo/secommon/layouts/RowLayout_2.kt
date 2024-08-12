package com.devartdgo.secommon.layouts

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun RowLayout_2(
    modifier: Modifier,
    content1: @Composable () -> Unit,
    content2: @Composable () -> Unit,
    content3: @Composable () -> Unit
) {
    ConstraintLayout(
        modifier = modifier
    )
    {
        val (item1Ref, item2Ref) = createRefs()
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .wrapContentWidth()
                .constrainAs(item1Ref) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            content1()
            content2()
        }

        Row(
            modifier = Modifier
                .wrapContentHeight()
                .wrapContentWidth()
                .constrainAs(item2Ref) {
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            content3()
        }
    }
}