package vectors.chess_vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChessKdt45: ImageVector
    get() {
        if (_chessKdt45 != null) {
            return _chessKdt45!!
        }
        _chessKdt45 =
            Builder(
                    name = "ChessKdt45",
                    defaultWidth = 45.0.dp,
                    defaultHeight = 45.0.dp,
                    viewportWidth = 45.0f,
                    viewportHeight = 45.0f,
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
                        moveTo(22.5f, 11.63f)
                        verticalLineTo(6.0f)
                        moveToRelative(0.0f, 19.0f)
                        reflectiveCurveToRelative(4.5f, -7.5f, 3.0f, -10.5f)
                        curveToRelative(0.0f, 0.0f, -1.0f, -2.5f, -3.0f, -2.5f)
                        reflectiveCurveToRelative(-3.0f, 2.5f, -3.0f, 2.5f)
                        curveToRelative(-1.5f, 3.0f, 3.0f, 10.5f, 3.0f, 10.5f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = null,
                        strokeLineWidth = 0.0f,
                        strokeLineCap = Butt,
                        strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(12.5f, 37.0f)
                        curveToRelative(5.5f, 3.5f, 14.5f, 3.5f, 20.0f, 0.0f)
                        verticalLineToRelative(-7.0f)
                        reflectiveCurveToRelative(9.0f, -4.5f, 6.0f, -10.5f)
                        curveToRelative(-4.0f, -6.5f, -13.5f, -3.5f, -16.0f, 4.0f)
                        verticalLineTo(27.0f)
                        verticalLineToRelative(-3.5f)
                        curveToRelative(-2.5f, -7.5f, -12.0f, -10.5f, -16.0f, -4.0f)
                        curveToRelative(-3.0f, 6.0f, 6.0f, 10.5f, 6.0f, 10.5f)
                        close()
                        moveTo(20.0f, 8.0f)
                        horizontalLineToRelative(5.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = null,
                        strokeLineWidth = 0.0f,
                        strokeLineCap = Butt,
                        strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(32.0f, 29.5f)
                        reflectiveCurveToRelative(8.5f, -4.0f, 6.03f, -9.65f)
                        curveTo(34.15f, 14.0f, 25.0f, 18.0f, 22.5f, 24.5f)
                        verticalLineToRelative(2.1f)
                        verticalLineToRelative(-2.1f)
                        curveTo(20.0f, 18.0f, 10.85f, 14.0f, 6.97f, 19.85f)
                        curveTo(4.5f, 25.5f, 13.0f, 29.5f, 13.0f, 29.5f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = null,
                        strokeLineWidth = 0.0f,
                        strokeLineCap = Butt,
                        strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(12.5f, 30.0f)
                        curveToRelative(5.5f, -3.0f, 14.5f, -3.0f, 20.0f, 0.0f)
                        moveToRelative(-20.0f, 3.5f)
                        curveToRelative(5.5f, -3.0f, 14.5f, -3.0f, 20.0f, 0.0f)
                        moveToRelative(-20.0f, 3.5f)
                        curveToRelative(5.5f, -3.0f, 14.5f, -3.0f, 20.0f, 0.0f)
                    }
                }
                .build()
        return _chessKdt45!!
    }

private var _chessKdt45: ImageVector? = null
