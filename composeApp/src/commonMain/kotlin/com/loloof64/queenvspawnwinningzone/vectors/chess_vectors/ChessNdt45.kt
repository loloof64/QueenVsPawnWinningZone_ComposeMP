package com.loloof64.queenvspawnwinningzone.vectors.chess_vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

val ChessNdt45: ImageVector
    get() {
        if (_chessNdt45 != null) {
            return _chessNdt45!!
        }
        _chessNdt45 =
            Builder(
                    name = "ChessNdt45",
                    defaultWidth = 45.0.dp,
                    defaultHeight = 45.0.dp,
                    viewportWidth = 45.0f,
                    viewportHeight = 45.0f,
                )
                .apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(22.0f, 10.3f)
                        curveTo(32.5f, 11.3f, 38.5f, 18.3f, 38.0f, 39.3f)
                        lineTo(15.0f, 39.3f)
                        curveTo(15.0f, 30.3f, 25.0f, 32.8f, 23.0f, 18.3f)
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
                        moveTo(24.0f, 18.3f)
                        curveTo(24.38f, 21.21f, 18.45f, 25.67f, 16.0f, 27.3f)
                        curveTo(13.0f, 29.3f, 13.18f, 31.64f, 11.0f, 31.3f)
                        curveTo(9.958f, 30.36f, 12.41f, 28.26f, 11.0f, 28.3f)
                        curveTo(10.0f, 28.3f, 11.19f, 29.53f, 10.0f, 30.3f)
                        curveTo(9.0f, 30.3f, 5.997f, 31.3f, 6.0f, 26.3f)
                        curveTo(6.0f, 24.3f, 12.0f, 14.3f, 12.0f, 14.3f)
                        curveTo(12.0f, 14.3f, 13.89f, 12.4f, 14.0f, 10.8f)
                        curveTo(13.27f, 9.806f, 13.5f, 8.8f, 13.5f, 7.8f)
                        curveTo(14.5f, 6.8f, 16.5f, 10.3f, 16.5f, 10.3f)
                        lineTo(18.5f, 10.3f)
                        curveTo(18.5f, 10.3f, 19.28f, 8.308f, 21.0f, 7.3f)
                        curveTo(22.0f, 7.3f, 22.0f, 10.3f, 22.0f, 10.3f)
                    }
                    path(
                        fill = SolidColor(Color(0xFFffffff)),
                        stroke = SolidColor(Color(0xFFffffff)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(9.5f, 25.8f)
                        arcTo(0.5f, 0.5f, 0.0f, true, true, 8.5f, 25.8f)
                        arcTo(0.5f, 0.5f, 0.0f, true, true, 9.5f, 25.8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFFffffff)),
                        stroke = SolidColor(Color(0xFFffffff)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(14.933f, 16.05f)
                        arcTo(1.5f, 0.5f, 120.001f, true, true, 14.067f, 15.55f)
                        arcTo(1.5f, 0.5f, 120.001f, true, true, 14.933f, 16.05f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFFFFFFFF)),
                        strokeLineWidth = 1.0f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(24.55f, 10.7f)
                        lineTo(24.1f, 12.15f)
                        lineTo(24.6f, 12.3f)
                        curveTo(27.75f, 13.3f, 30.25f, 14.79f, 32.5f, 19.05f)
                        curveTo(34.75f, 23.31f, 35.75f, 29.36f, 35.25f, 39.3f)
                        lineTo(35.2f, 39.8f)
                        lineTo(37.45f, 39.8f)
                        lineTo(37.5f, 39.3f)
                        curveTo(38.0f, 29.24f, 36.62f, 22.45f, 34.25f, 17.96f)
                        curveTo(31.88f, 13.47f, 28.46f, 11.32f, 25.06f, 10.8f)
                        lineTo(24.55f, 10.7f)
                        close()
                    }
                }
                .build()
        return _chessNdt45!!
    }

private var _chessNdt45: ImageVector? = null
