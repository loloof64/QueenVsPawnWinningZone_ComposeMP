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

val ArrowBack: ImageVector
    get() {
        if (_arrowBack != null) {
            return _arrowBack!!
        }
        _arrowBack =
            Builder(
                    name = "ArrowBack",
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
                        moveTo(24.0f, 40.0f)
                        lineTo(8.0f, 24.0f)
                        lineTo(24.0f, 8.0f)
                        lineToRelative(2.1f, 2.1f)
                        lineToRelative(-12.4f, 12.4f)
                        horizontalLineTo(40.0f)
                        verticalLineToRelative(3.0f)
                        horizontalLineTo(13.7f)
                        lineToRelative(12.4f, 12.4f)
                        close()
                    }
                }
                .build()
        return _arrowBack!!
    }

private var _arrowBack: ImageVector? = null
