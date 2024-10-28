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

val ChessQdt45: ImageVector
    get() {
        if (_chessQdt45 != null) {
            return _chessQdt45!!
        }
        _chessQdt45 =
            Builder(
                    name = "ChessQdt45",
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
                        moveTo(9.0f, 26.0f)
                        curveToRelative(8.5f, -1.5f, 21.0f, -1.5f, 27.0f, 0.0f)
                        lineToRelative(2.5f, -12.5f)
                        lineTo(31.0f, 25.0f)
                        lineToRelative(-0.3f, -14.1f)
                        lineToRelative(-5.2f, 13.6f)
                        lineToRelative(-3.0f, -14.5f)
                        lineToRelative(-3.0f, 14.5f)
                        lineToRelative(-5.2f, -13.6f)
                        lineTo(14.0f, 25.0f)
                        lineTo(6.5f, 13.5f)
                        close()
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
                        moveTo(9.0f, 26.0f)
                        curveToRelative(0.0f, 2.0f, 1.5f, 2.0f, 2.5f, 4.0f)
                        curveToRelative(1.0f, 1.5f, 1.0f, 1.0f, 0.5f, 3.5f)
                        curveToRelative(-1.5f, 1.0f, -1.0f, 2.5f, -1.0f, 2.5f)
                        curveToRelative(-1.5f, 1.5f, 0.0f, 2.5f, 0.0f, 2.5f)
                        curveToRelative(6.5f, 1.0f, 16.5f, 1.0f, 23.0f, 0.0f)
                        curveToRelative(0.0f, 0.0f, 1.5f, -1.0f, 0.0f, -2.5f)
                        curveToRelative(0.0f, 0.0f, 0.5f, -1.5f, -1.0f, -2.5f)
                        curveToRelative(-0.5f, -2.5f, -0.5f, -2.0f, 0.5f, -3.5f)
                        curveToRelative(1.0f, -2.0f, 2.5f, -2.0f, 2.5f, -4.0f)
                        curveToRelative(-8.5f, -1.5f, -18.5f, -1.5f, -27.0f, 0.0f)
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
                        moveTo(11.5f, 30.0f)
                        curveToRelative(3.5f, -1.0f, 18.5f, -1.0f, 22.0f, 0.0f)
                        moveTo(12.0f, 33.5f)
                        curveToRelative(6.0f, -1.0f, 15.0f, -1.0f, 21.0f, 0.0f)
                        moveTo(4.0f, 12.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                        moveToRelative(8.0f, -3.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                        moveToRelative(8.5f, -1.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                        moveTo(29.0f, 9.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                        moveToRelative(8.0f, 3.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                        moveTo(11.0f, 38.5f)
                        arcToRelative(35.0f, 35.0f, 1.0f, false, false, 23.0f, 0.0f)
                        moveTo(11.0f, 29.0f)
                        arcToRelative(35.0f, 35.0f, 1.0f, false, true, 23.0f, 0.0f)
                        moveToRelative(-21.5f, 2.5f)
                        horizontalLineToRelative(20.0f)
                        moveToRelative(-21.0f, 3.0f)
                        arcToRelative(35.0f, 35.0f, 1.0f, false, false, 22.0f, 0.0f)
                        moveToRelative(-23.0f, 3.0f)
                        arcToRelative(35.0f, 35.0f, 1.0f, false, false, 24.0f, 0.0f)
                    }
                }
                .build()
        return _chessQdt45!!
    }

private var _chessQdt45: ImageVector? = null
