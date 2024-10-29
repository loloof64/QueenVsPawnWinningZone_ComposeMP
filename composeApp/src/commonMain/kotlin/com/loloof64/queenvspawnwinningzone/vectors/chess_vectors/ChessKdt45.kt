package com.loloof64.queenvspawnwinningzone.vectors.chess_vectors

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

val ChessKdt45: ImageVector
    get() {
        if (_chessKdt45 != null) {
            return _chessKdt45!!
        }
        _chessKdt45 =
            Builder(
                    name = "ChessKdt45",
                    defaultWidth = 45.0.dp,
                    defaultHeight = 45.0.dp,
                    viewportWidth = 45.0f,
                    viewportHeight = 45.0f,
                )
                .apply {
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(22.5f, 11.63f)
                        lineTo(22.5f, 6.0f)
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
                        curveTo(22.5f, 25.0f, 27.0f, 17.5f, 25.5f, 14.5f)
                        curveTo(25.5f, 14.5f, 24.5f, 12.0f, 22.5f, 12.0f)
                        curveTo(20.5f, 12.0f, 19.5f, 14.5f, 19.5f, 14.5f)
                        curveTo(18.0f, 17.5f, 22.5f, 25.0f, 22.5f, 25.0f)
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
                        curveTo(18.0f, 40.5f, 27.0f, 40.5f, 32.5f, 37.0f)
                        lineTo(32.5f, 30.0f)
                        curveTo(32.5f, 30.0f, 41.5f, 25.5f, 38.5f, 19.5f)
                        curveTo(34.5f, 13.0f, 25.0f, 16.0f, 22.5f, 23.5f)
                        lineTo(22.5f, 27.0f)
                        lineTo(22.5f, 23.5f)
                        curveTo(20.0f, 16.0f, 10.5f, 13.0f, 6.5f, 19.5f)
                        curveTo(3.5f, 25.5f, 12.5f, 30.0f, 12.5f, 30.0f)
                        lineTo(12.5f, 37.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(20.0f, 8.0f)
                        lineTo(25.0f, 8.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFFFFFFFF)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(32.0f, 29.5f)
                        curveTo(32.0f, 29.5f, 40.5f, 25.5f, 38.03f, 19.85f)
                        curveTo(34.15f, 14.0f, 25.0f, 18.0f, 22.5f, 24.5f)
                        lineTo(22.5f, 26.6f)
                        lineTo(22.5f, 24.5f)
                        curveTo(20.0f, 18.0f, 10.85f, 14.0f, 6.97f, 19.85f)
                        curveTo(4.5f, 25.5f, 13.0f, 29.5f, 13.0f, 29.5f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFFFFFFFF)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(12.5f, 30.0f)
                        curveTo(18.0f, 27.0f, 27.0f, 27.0f, 32.5f, 30.0f)
                        moveTo(12.5f, 33.5f)
                        curveTo(18.0f, 30.5f, 27.0f, 30.5f, 32.5f, 33.5f)
                        moveTo(12.5f, 37.0f)
                        curveTo(18.0f, 34.0f, 27.0f, 34.0f, 32.5f, 37.0f)
                    }
                }
                .build()
        return _chessKdt45!!
    }

private var _chessKdt45: ImageVector? = null
