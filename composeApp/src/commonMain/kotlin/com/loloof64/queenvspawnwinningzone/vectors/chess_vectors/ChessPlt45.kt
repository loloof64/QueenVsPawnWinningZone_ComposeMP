package com.loloof64.queenvspawnwinningzone.vectors.chess_vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChessPlt45: ImageVector
    get() {
        if (_chessPlt45 != null) {
            return _chessPlt45!!
        }
        _chessPlt45 =
            Builder(
                    name = "ChessPlt45",
                    defaultWidth = 45.0.dp,
                    defaultHeight = 45.0.dp,
                    viewportWidth = 45.0f,
                    viewportHeight = 45.0f,
                )
                .apply {
                    path(
                        fill = SolidColor(Color(0xFFffffff)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = Round,
                        strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveToRelative(22.5f, 9.0f)
                        curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                        curveToRelative(0.0f, 0.89f, 0.29f, 1.71f, 0.78f, 2.38f)
                        curveTo(17.33f, 16.5f, 16.0f, 18.59f, 16.0f, 21.0f)
                        curveToRelative(0.0f, 2.03f, 0.94f, 3.84f, 2.41f, 5.03f)
                        curveTo(15.41f, 27.09f, 11.0f, 31.58f, 11.0f, 39.5f)
                        horizontalLineTo(34.0f)
                        curveTo(34.0f, 31.58f, 29.59f, 27.09f, 26.59f, 26.03f)
                        curveTo(28.06f, 24.84f, 29.0f, 23.03f, 29.0f, 21.0f)
                        curveTo(29.0f, 18.59f, 27.67f, 16.5f, 25.72f, 15.38f)
                        curveTo(26.21f, 14.71f, 26.5f, 13.89f, 26.5f, 13.0f)
                        curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                        close()
                    }
                }
                .build()
        return _chessPlt45!!
    }

private var _chessPlt45: ImageVector? = null
