package com.devartdgo.testlibrary

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.devartdgo.secommon.seButton.SeButton
import com.devartdgo.secommon.seButton.SeButtonBaseProperties
import com.devartdgo.secommon.seButton.V1Properties
import com.devartdgo.secommon.seButton.V2Properties
import com.devartdgo.secommon.seButton.V3Properties
import com.devartdgo.secommon.seButton.Version
import com.devartdgo.secommon.seButton.defaults.SeButtonCircleSizeDefaults
import com.devartdgo.secommon.seConstants.SeColor
import com.devartdgo.testlibrary.ui.theme.TestLibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestLibraryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        SeButton(
                            version = Version.V1(
                                properties = V1Properties(
                                    baseProperties = SeButtonBaseProperties(
                                        onClick = { Log.d("Juan", "V1 on click")}
                                    ),
                                    text = "V1"
                                )
                            )
                        )

                        SeButton(
                            version = Version.V2(
                                properties = V2Properties(
                                    baseProperties = SeButtonBaseProperties(
                                        onClick = { Log.d("Juan", "V2 on click")}
                                    ),
                                    text = "V2",
                                    color = SeColor.SE_COLOR2
                                )
                            )
                        )

                        SeButton(
                            version = Version.V3(
                                properties = V3Properties(
                                    baseProperties = SeButtonBaseProperties(
                                        onClick = { Log.d("Juan", "V3 on click")}
                                    ),
                                    icon = com.devartdgo.secommon.R.drawable.ic_se_check,
                                )
                            )
                        )

                        SeButton(
                            version = Version.V3(
                                properties = V3Properties(
                                    baseProperties = SeButtonBaseProperties(
                                        onClick = { Log.d("Juan", "V3 - second on click")}
                                    ),
                                    size = SeButtonCircleSizeDefaults.BIG,
                                    color = SeColor.SE_COLOR2
                                )
                            )
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    TestLibraryTheme {
    }
}