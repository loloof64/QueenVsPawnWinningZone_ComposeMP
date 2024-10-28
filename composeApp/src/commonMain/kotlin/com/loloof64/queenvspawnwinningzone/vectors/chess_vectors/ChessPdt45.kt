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

val ChessPdt45: ImageVector
    get() {
        if (_chessPdt45 != null) {
            return _chessPdt45!!
        }
        _chessPdt45 =
            Builder(
                    name = "ChessPdt45",
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
                        moveTo(22.5f, 9.0f)
                        curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                        curveToRelative(0.0f, 0.89f, 0.29f, 1.71f, 0.78f, 2.38f)
                        curveTo(17.33f, 16.5f, 16.0f, 18.59f, 16.0f, 21.0f)
                        curveToRelative(0.0f, 2.03f, 0.94f, 3.84f, 2.41f, 5.03f)
                        curveToRelative(-3.0f, 1.06f, -7.41f, 5.55f, -7.41f, 13.47f)
                        horizontalLineToRelative(23.0f)
                        curveToRelative(0.0f, -7.92f, -4.41f, -12.41f, -7.41f, -13.47f)
                        curveToRelative(1.47f, -1.19f, 2.41f, -3.0f, 2.41f, -5.03f)
                        curveToRelative(0.0f, -2.41f, -1.33f, -4.5f, -3.28f, -5.62f)
                        curveToRelative(0.49f, -0.67f, 0.78f, -1.49f, 0.78f, -2.38f)
                        curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                    }
                }
                .build()
        return _chessPdt45!!
    }

private var _chessPdt45: ImageVector? = null
