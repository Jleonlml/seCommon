package com.devartdgo.secommon.layouts

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun RowLayout_1(
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .height(32.dp),
    content1: @Composable () -> Unit,
    content2: @Composable () -> Unit
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
            content2()
        }
    }
}