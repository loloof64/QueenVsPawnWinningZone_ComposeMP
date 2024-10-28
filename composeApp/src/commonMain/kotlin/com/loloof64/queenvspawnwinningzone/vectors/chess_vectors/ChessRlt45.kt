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

val ChessRlt45: ImageVector
    get() {
        if (_chessRlt45 != null) {
            return _chessRlt45!!
        }
        _chessRlt45 =
            Builder(
                    name = "ChessRlt45",
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
                        moveTo(9.0f, 39.3f)
                        horizontalLineToRelative(27.0f)
                        verticalLineToRelative(-3.0f)
                        horizontalLineTo(9.0f)
                        close()
                        moveToRelative(3.0f, -3.0f)
                        verticalLineToRelative(-4.0f)
                        horizontalLineToRelative(21.0f)
                        verticalLineToRelative(4.0f)
                        close()
                        moveToRelative(-1.0f, -22.0f)
                        verticalLineToRelative(-5.0f)
                        horizontalLineToRelative(4.0f)
                        verticalLineToRelative(2.0f)
                        horizontalLineToRelative(5.0f)
                        verticalLineToRelative(-2.0f)
                        horizontalLineToRelative(5.0f)
                        verticalLineToRelative(2.0f)
                        horizontalLineToRelative(5.0f)
                        verticalLineToRelative(-2.0f)
                        horizontalLineToRelative(4.0f)
                        verticalLineToRelative(5.0f)
                        moveToRelative(0.0f, 0.0f)
                        lineToRelative(-3.0f, 3.0f)
                        horizontalLineTo(14.0f)
                        lineToRelative(-3.0f, -3.0f)
                        moveToRelative(20.0f, 3.0f)
                        verticalLineToRelative(12.5f)
                        horizontalLineTo(14.0f)
                        verticalLineTo(17.3f)
                        moveToRelative(17.0f, 12.5f)
                        lineToRelative(1.5f, 2.5f)
                        horizontalLineToRelative(-20.0f)
                        lineToRelative(1.5f, -2.5f)
                        moveToRelative(-3.0f, -15.5f)
                        horizontalLineToRelative(23.0f)
                    }
                }
                .build()
        return _chessRlt45!!
    }

private var _chessRlt45: ImageVector? = null
