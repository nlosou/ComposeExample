package com.composeexample.android.myiconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composeexample.android.MyIconPack
import kotlin.Unit

public val MyIconPack.MySpectrum: ImageVector
    get() {
        if (_mySpectrum != null) {
            return _mySpectrum!!
        }
        _mySpectrum = Builder(name = "MySpectrum", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(41.865f, 42.5f)
                curveToRelative(0.0f, -9.867f, -7.999f, -17.865f, -17.865f, -17.865f)
                reflectiveCurveToRelative(-17.865f, 7.999f, -17.865f, 17.865f)
                horizontalLineToRelative(35.731f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.412f, 15.074f)
                moveToRelative(-9.574f, 0.0f)
                arcToRelative(9.574f, 9.574f, 0.0f, true, true, 19.148f, 0.0f)
                arcToRelative(9.574f, 9.574f, 0.0f, true, true, -19.148f, 0.0f)
            }
        }
        .build()
        return _mySpectrum!!
    }

private var _mySpectrum: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.MySpectrum, contentDescription = "")
    }
}
