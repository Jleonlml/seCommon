package com.devartdgo.secommon.components.screenHeader

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.devartdgo.secommon.components.renderableText.RenderableText

@Composable
fun ScreenHeaderLayout(
    startItem: @Composable () -> Unit,
    endItem: @Composable () -> Unit,
    headerText: String,
    headerTextStyle: TextStyle
) {
    ConstraintLayout(
        modifier = Modifier.fillMaxWidth().height(70.dp)
    )
    {
        val (item1Ref, item2Ref, item3Ref) = createRefs()
        Box(
            modifier = Modifier.constrainAs(item1Ref) {
                start.linkTo(parent.start, margin = 16.dp)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            }
        ) {
            startItem()
        }


        RenderableText(
            modifier = Modifier.constrainAs(item2Ref) {
                end.linkTo(parent.end)
                start.linkTo(parent.start)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            }.semantics { heading() },
            text = headerText,
            style = headerTextStyle
        )

        Box(
            modifier = Modifier.constrainAs(item3Ref) {
                end.linkTo(parent.end, margin = 16.dp)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            }
        ) {
            endItem()
        }
    }
}