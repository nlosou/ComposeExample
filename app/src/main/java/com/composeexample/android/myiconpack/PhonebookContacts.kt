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
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composeexample.android.MyIconPack
import kotlin.Unit

public val MyIconPack.PhonebookContacts: ImageVector
    get() {
        if (_phonebookContacts != null) {
            return _phonebookContacts!!
        }
        _phonebookContacts = Builder(name = "PhonebookContacts", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF020202)),
                    strokeLineWidth = 1.91f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.39f, 1.5f)
                horizontalLineToRelative(19.09f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(-19.09f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF020202)),
                    strokeLineWidth = 1.91f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.89f, 8.18f)
                moveToRelative(-2.86f, 0.0f)
                arcToRelative(2.86f, 2.86f, 0.0f, true, true, 5.72f, 0.0f)
                arcToRelative(2.86f, 2.86f, 0.0f, true, true, -5.72f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF020202)),
                    strokeLineWidth = 1.91f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.11f, 15.82f)
                lineToRelative(0.21f, -1.0f)
                arcToRelative(4.65f, 4.65f, 0.0f, false, true, 4.57f, -3.74f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.64f, 4.64f, 0.0f, false, true, 4.56f, 3.74f)
                lineToRelative(0.21f, 1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF020202)),
                    strokeLineWidth = 1.91f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.52f, 5.32f)
                lineTo(6.25f, 5.32f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF020202)),
                    strokeLineWidth = 1.91f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.52f, 10.09f)
                lineTo(6.25f, 10.09f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF020202)),
                    strokeLineWidth = 1.91f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.52f, 14.86f)
                lineTo(6.25f, 14.86f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF020202)),
                    strokeLineWidth = 1.91f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.52f, 19.64f)
                lineTo(6.25f, 19.64f)
            }
        }
        .build()
        return _phonebookContacts!!
    }

private var _phonebookContacts: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.PhonebookContacts, contentDescription = "")
    }
}
