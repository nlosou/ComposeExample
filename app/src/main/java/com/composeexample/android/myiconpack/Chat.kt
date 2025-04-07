package com.composeexample.android.myiconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composeexample.android.MyIconPack
import kotlin.Unit

public val MyIconPack.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = Builder(name = "Chat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF09244B)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                curveTo(19.761f, 3.0f, 22.0f, 5.239f, 22.0f, 8.0f)
                lineTo(22.0f, 16.0f)
                curveTo(22.0f, 18.761f, 19.761f, 21.0f, 17.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                lineTo(2.0f, 8.0f)
                curveTo(2.0f, 5.239f, 4.239f, 3.0f, 7.0f, 3.0f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(17.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                curveTo(5.343f, 5.0f, 4.0f, 6.343f, 4.0f, 8.0f)
                lineTo(4.0f, 19.0f)
                lineTo(17.0f, 19.0f)
                curveTo(18.657f, 19.0f, 20.0f, 17.657f, 20.0f, 16.0f)
                lineTo(20.0f, 8.0f)
                curveTo(20.0f, 6.343f, 18.657f, 5.0f, 17.0f, 5.0f)
                close()
                moveTo(9.0f, 10.0f)
                curveTo(9.552f, 10.0f, 10.0f, 10.448f, 10.0f, 11.0f)
                lineTo(10.0f, 13.0f)
                curveTo(10.0f, 13.552f, 9.552f, 14.0f, 9.0f, 14.0f)
                curveTo(8.448f, 14.0f, 8.0f, 13.552f, 8.0f, 13.0f)
                lineTo(8.0f, 11.0f)
                curveTo(8.0f, 10.448f, 8.448f, 10.0f, 9.0f, 10.0f)
                close()
                moveTo(15.0f, 10.0f)
                curveTo(15.513f, 10.0f, 15.936f, 10.386f, 15.993f, 10.883f)
                lineTo(16.0f, 11.0f)
                lineTo(16.0f, 13.0f)
                curveTo(16.0f, 13.552f, 15.552f, 14.0f, 15.0f, 14.0f)
                curveTo(14.487f, 14.0f, 14.064f, 13.614f, 14.007f, 13.117f)
                lineTo(14.0f, 13.0f)
                lineTo(14.0f, 11.0f)
                curveTo(14.0f, 10.448f, 14.448f, 10.0f, 15.0f, 10.0f)
                close()
            }
        }
        .build()
        return _chat!!
    }

private var _chat: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.Chat, contentDescription = "")
    }
}
