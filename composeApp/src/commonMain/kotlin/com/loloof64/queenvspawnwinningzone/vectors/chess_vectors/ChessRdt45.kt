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

val ChessRdt45: ImageVector
    get() {
        if (_chessRdt45 != null) {
            return _chessRdt45!!
        }
        _chessRdt45 =
            Builder(
                    name = "ChessRdt45",
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
                        moveToRelative(3.5f, -7.0f)
                        lineToRelative(1.5f, -2.5f)
                        horizontalLineToRelative(17.0f)
                        lineToRelative(1.5f, 2.5f)
                        close()
                        moveToRelative(-0.5f, 4.0f)
                        verticalLineToRelative(-4.0f)
                        horizontalLineToRelative(21.0f)
                        verticalLineToRelative(4.0f)
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
                        moveTo(14.0f, 29.8f)
                        verticalLineToRelative(-13.0f)
                        horizontalLineToRelative(17.0f)
                        verticalLineToRelative(13.0f)
                        close()
                        moveToRelative(0.0f, -13.0f)
                        lineToRelative(-3.0f, -2.5f)
                        horizontalLineToRelative(23.0f)
                        lineToRelative(-3.0f, 2.5f)
                        close()
                        moveToRelative(-3.0f, -2.5f)
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
                        close()
                        moveToRelative(1.0f, 21.5f)
                        horizontalLineToRelative(21.0f)
                        moveToRelative(-20.0f, -4.0f)
                        horizontalLineToRelative(19.0f)
                        moveToRelative(-18.0f, -2.0f)
                        horizontalLineToRelative(17.0f)
                        moveToRelative(-17.0f, -13.0f)
                        horizontalLineToRelative(17.0f)
                        moveToRelative(-20.0f, -2.5f)
                        horizontalLineToRelative(23.0f)
                    }
                }
                .build()
        return _chessRdt45!!
    }

private var _chessRdt45: ImageVector? = null
