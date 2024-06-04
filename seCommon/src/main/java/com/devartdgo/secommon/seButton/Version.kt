package com.devartdgo.secommon.seButton

import com.devartdgo.secommon.R
import com.devartdgo.secommon.seButton.defaults.SeButtonCircleSizeDefaults
import com.devartdgo.secommon.seConstants.SeColor

sealed class Version {
    data class V1(val properties: V1Properties = V1Properties()): Version()
    data class V2(val properties: V2Properties = V2Properties()): Version()
    data class V3(val properties: V3Properties = V3Properties()): Version()
}

data class SeButtonBaseProperties(
    val onClick: () -> Unit = {}
)

data class V1Properties(
    val baseProperties: SeButtonBaseProperties = SeButtonBaseProperties(),
    val text: String = "default",
)

data class V2Properties(
    val baseProperties: SeButtonBaseProperties = SeButtonBaseProperties(),
    val text: String = "default",
    val color: SeColor = SeColor.SE_COLOR1
)

data class V3Properties(
    val baseProperties: SeButtonBaseProperties = SeButtonBaseProperties(),
    val icon: Int = R.drawable.ic_se_android,
    val color: SeColor = SeColor.SE_COLOR1,
    val size: SeButtonCircleSizeDefaults = SeButtonCircleSizeDefaults.MEDIUM
)

