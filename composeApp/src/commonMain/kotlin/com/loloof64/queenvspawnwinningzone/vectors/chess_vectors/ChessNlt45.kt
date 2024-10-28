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

val ChessNlt45: ImageVector
    get() {
        if (_chessNlt45 != null) {
            return _chessNlt45!!
        }
        _chessNlt45 =
            Builder(
                    name = "ChessNlt45",
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
                        moveTo(22.0f, 10.3f)
                        curveToRelative(10.5f, 1.0f, 16.5f, 8.0f, 16.0f, 29.0f)
                        horizontalLineTo(15.0f)
                        curveToRelative(0.0f, -9.0f, 10.0f, -6.5f, 8.0f, -21.0f)
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
                        moveTo(24.0f, 18.3f)
                        curveToRelative(0.38f, 2.91f, -5.55f, 7.37f, -8.0f, 9.0f)
                        curveToRelative(-3.0f, 2.0f, -2.82f, 4.34f, -5.0f, 4.0f)
                        curveToRelative(-1.042f, -0.94f, 1.41f, -3.04f, 0.0f, -3.0f)
                        curveToRelative(-1.0f, 0.0f, 0.19f, 1.23f, -1.0f, 2.0f)
                        curveToRelative(-1.0f, 0.0f, -4.003f, 1.0f, -4.0f, -4.0f)
                        curveToRelative(0.0f, -2.0f, 6.0f, -12.0f, 6.0f, -12.0f)
                        reflectiveCurveToRelative(1.89f, -1.9f, 2.0f, -3.5f)
                        curveToRelative(-0.73f, -0.994f, -0.5f, -2.0f, -0.5f, -3.0f)
                        curveToRelative(1.0f, -1.0f, 3.0f, 2.5f, 3.0f, 2.5f)
                        horizontalLineToRelative(2.0f)
                        reflectiveCurveToRelative(0.78f, -1.992f, 2.5f, -3.0f)
                        curveToRelative(1.0f, 0.0f, 1.0f, 3.0f, 1.0f, 3.0f)
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
                        moveTo(9.5f, 25.8f)
                        arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                        arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                        moveToRelative(5.433f, -9.75f)
                        arcToRelative(0.5f, 1.5f, 30.0f, true, true, -0.866f, -0.5f)
                        arcToRelative(0.5f, 1.5f, 30.0f, true, true, 0.866f, 0.5f)
                    }
                }
                .build()
        return _chessNlt45!!
    }

private var _chessNlt45: ImageVector? = null
