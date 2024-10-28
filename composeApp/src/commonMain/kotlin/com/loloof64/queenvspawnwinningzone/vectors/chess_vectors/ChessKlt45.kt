package vectors.chess_vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

val ChessKlt45: ImageVector
    get() {
        if (_chessKlt45 != null) {
            return _chessKlt45!!
        }
        _chessKlt45 =
            Builder(
                    name = "ChessKlt45",
                    defaultWidth = 45.0.dp,
                    defaultHeight = 45.0.dp,
                    viewportWidth = 45.0f,
                    viewportHeight = 45.0f,
                )
                .apply {
                    path(
                        fill = null,
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(22.5f, 11.63f)
                        verticalLineTo(6.0f)
                        moveTo(20.0f, 8.0f)
                        horizontalLineToRelative(5.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = Butt,
                        strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(22.5f, 25.0f)
                        reflectiveCurveToRelative(4.5f, -7.5f, 3.0f, -10.5f)
                        curveToRelative(0.0f, 0.0f, -1.0f, -2.5f, -3.0f, -2.5f)
                        reflectiveCurveToRelative(-3.0f, 2.5f, -3.0f, 2.5f)
                        curveToRelative(-1.5f, 3.0f, 3.0f, 10.5f, 3.0f, 10.5f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
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
                    }
                    path(
                        fill = null,
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
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
        return _chessKlt45!!
    }

private var _chessKlt45: ImageVector? = null
