package com.devartdgo.secommon.seButton

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.devartdgo.secommon.seButton.defaults.SeButtonCircleSizeDefaults
import com.devartdgo.secommon.seConstants.SeColor

@Composable
fun SeButton(version: Version) {
    when(version) {
        is Version.V1 -> {
            btnImp(
                text = version.properties.text,
                onClick = version.properties.baseProperties.onClick
            )
        }
        is Version.V2 -> {
            btnImp(
                text =  version.properties.text,
                seColor = version.properties.color,
                onClick = version.properties.baseProperties.onClick
            )
        }
        is Version.V3 -> {
            circleBtnImp(
                icon =  version.properties.icon,
                seColor = version.properties.color,
                seBtnSize = version.properties.size,
                onClick = version.properties.baseProperties.onClick
            )
        }
    }
}

@Composable
private fun btnImp(
    text: String,
    seColor: SeColor = SeColor.SE_COLOR1,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = { onClick.invoke() },
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = seColor.value)
        )
    ) {
        Text(text = text)
    }
}

@Composable
private fun circleBtnImp(
    icon: Int,
    seColor: SeColor,
    seBtnSize: SeButtonCircleSizeDefaults,
    onClick: () -> Unit
) {
    Button(
        modifier = Modifier.size(seBtnSize.size),
        onClick = { onClick.invoke() },
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = seColor.value)
        ),
        contentPadding = PaddingValues(0.dp)
    ) {
        Icon(painter = painterResource(id = icon), contentDescription = "desc")
    }
}