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

val ChessBdt45: ImageVector
    get() {
        if (_chessBdt45 != null) {
            return _chessBdt45!!
        }
        _chessBdt45 =
            Builder(
                    name = "ChessBdt45",
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
                        moveTo(9.0f, 36.6f)
                        curveToRelative(3.39f, -0.97f, 10.11f, 0.43f, 13.5f, -2.0f)
                        curveToRelative(3.39f, 2.43f, 10.11f, 1.03f, 13.5f, 2.0f)
                        curveToRelative(0.0f, 0.0f, 1.65f, 0.54f, 3.0f, 2.0f)
                        curveToRelative(-0.68f, 0.97f, -1.65f, 0.99f, -3.0f, 0.5f)
                        curveToRelative(-3.39f, -0.97f, -10.11f, 0.46f, -13.5f, -1.0f)
                        curveToRelative(-3.39f, 1.46f, -10.11f, 0.03f, -13.5f, 1.0f)
                        curveToRelative(-1.35f, 0.49f, -2.32f, 0.47f, -3.0f, -0.5f)
                        curveToRelative(1.35f, -1.46f, 3.0f, -2.0f, 3.0f, -2.0f)
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
                        moveTo(15.0f, 32.6f)
                        curveToRelative(2.5f, 2.5f, 12.5f, 2.5f, 15.0f, 0.0f)
                        curveToRelative(0.5f, -1.5f, 0.0f, -2.0f, 0.0f, -2.0f)
                        curveToRelative(0.0f, -2.5f, -2.5f, -4.0f, -2.5f, -4.0f)
                        curveToRelative(5.5f, -1.5f, 6.0f, -11.5f, -5.0f, -15.5f)
                        curveToRelative(-11.0f, 4.0f, -10.5f, 14.0f, -5.0f, 15.5f)
                        curveToRelative(0.0f, 0.0f, -2.5f, 1.5f, -2.5f, 4.0f)
                        curveToRelative(0.0f, 0.0f, -0.5f, 0.5f, 0.0f, 2.0f)
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
                        moveTo(25.0f, 8.6f)
                        arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                        arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                        moveToRelative(-7.5f, 18.0f)
                        horizontalLineToRelative(10.0f)
                        moveToRelative(-12.5f, 4.0f)
                        horizontalLineToRelative(15.0f)
                        moveToRelative(-7.5f, -14.5f)
                        verticalLineToRelative(5.0f)
                        moveTo(20.0f, 18.6f)
                        horizontalLineToRelative(5.0f)
                    }
                }
                .build()
        return _chessBdt45!!
    }

private var _chessBdt45: ImageVector? = null
