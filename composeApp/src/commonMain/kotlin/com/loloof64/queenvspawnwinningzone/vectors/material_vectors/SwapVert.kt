package vectors.material_vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SwapVert: ImageVector
    get() {
        if (_swapVert != null) {
            return _swapVert!!
        }
        _swapVert =
            Builder(
                    name = "SwapVert",
                    defaultWidth = 48.0.dp,
                    defaultHeight = 48.0.dp,
                    viewportWidth = 48.0f,
                    viewportHeight = 48.0f,
                )
                .apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = null,
                        strokeLineWidth = 0.0f,
                        strokeLineCap = Butt,
                        strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(16.1f, 25.5f)
                        verticalLineTo(9.7f)
                        lineToRelative(-6.0f, 6.0f)
                        lineTo(8.0f, 13.6f)
                        lineToRelative(9.65f, -9.65f)
                        lineToRelative(9.65f, 9.65f)
                        lineToRelative(-2.1f, 2.1f)
                        lineToRelative(-6.1f, -6.05f)
                        verticalLineTo(25.5f)
                        close()
                        moveToRelative(14.25f, 18.45f)
                        lineToRelative(-9.65f, -9.7f)
                        lineToRelative(2.1f, -2.05f)
                        lineToRelative(6.0f, 6.0f)
                        verticalLineTo(22.4f)
                        horizontalLineToRelative(3.0f)
                        verticalLineToRelative(15.85f)
                        lineToRelative(6.1f, -6.05f)
                        lineToRelative(2.1f, 2.1f)
                        close()
                    }
                }
                .build()
        return _swapVert!!
    }

private var _swapVert: ImageVector? = null
