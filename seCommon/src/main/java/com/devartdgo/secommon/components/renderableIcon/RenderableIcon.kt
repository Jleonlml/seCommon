package com.devartdgo.secommon.components.renderableIcon

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RenderableIcon(
    iconRes: Int,
    contentDescription: String,
    isClickable: Boolean = false,
    onClick: () -> Unit = {},
    height: Dp = 42.dp,
    width: Dp = 42.dp
) {
    RenderIcon(
        iconRes = iconRes,
        contentDescription = contentDescription,
        isClickable = isClickable,
        onClick = onClick,
        height = height,
        width = width
    )
}

@Composable
private fun RenderIcon(
    iconRes: Int,
    contentDescription: String,
    isClickable: Boolean,
    onClick: () -> Unit,
    height: Dp,
    width: Dp
) {

    Icon(
        modifier = getModifier(
            height = height,
            width = width,
            onClick = onClick,
            isClickable = isClickable
        ),
        painter = painterResource(id = iconRes),
        contentDescription = contentDescription
    )
}

private fun getModifier(
    height: Dp,
    width: Dp,
    onClick: () -> Unit,
    isClickable: Boolean
): Modifier {
    return if (isClickable) {
        Modifier.width(width).height(height).clickable { onClick() }
    } else {
        Modifier.width(width).height(height)
    }
}