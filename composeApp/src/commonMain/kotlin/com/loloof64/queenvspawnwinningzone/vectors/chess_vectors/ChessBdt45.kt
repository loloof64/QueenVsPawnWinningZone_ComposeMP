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
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = Butt,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(9.0f, 36.6f)
                        curveTo(12.39f, 35.63f, 19.11f, 37.03f, 22.5f, 34.6f)
                        curveTo(25.89f, 37.03f, 32.61f, 35.63f, 36.0f, 36.6f)
                        curveTo(36.0f, 36.6f, 37.65f, 37.14f, 39.0f, 38.6f)
                        curveTo(38.32f, 39.57f, 37.35f, 39.59f, 36.0f, 39.1f)
                        curveTo(32.61f, 38.13f, 25.89f, 39.56f, 22.5f, 38.1f)
                        curveTo(19.11f, 39.56f, 12.39f, 38.13f, 9.0f, 39.1f)
                        curveTo(7.65f, 39.59f, 6.68f, 39.57f, 6.0f, 38.6f)
                        curveTo(7.35f, 37.14f, 9.0f, 36.6f, 9.0f, 36.6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = Butt,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(15.0f, 32.6f)
                        curveTo(17.5f, 35.1f, 27.5f, 35.1f, 30.0f, 32.6f)
                        curveTo(30.5f, 31.1f, 30.0f, 30.6f, 30.0f, 30.6f)
                        curveTo(30.0f, 28.1f, 27.5f, 26.6f, 27.5f, 26.6f)
                        curveTo(33.0f, 25.1f, 33.5f, 15.1f, 22.5f, 11.1f)
                        curveTo(11.5f, 15.1f, 12.0f, 25.1f, 17.5f, 26.6f)
                        curveTo(17.5f, 26.6f, 15.0f, 28.1f, 15.0f, 30.6f)
                        curveTo(15.0f, 30.6f, 14.5f, 31.1f, 15.0f, 32.6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = Butt,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(25.0f, 8.6f)
                        arcTo(2.5f, 2.5f, 0.0f, true, true, 20.0f, 8.6f)
                        arcTo(2.5f, 2.5f, 0.0f, true, true, 25.0f, 8.6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFFffffff)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(17.5f, 26.6f)
                        lineTo(27.5f, 26.6f)
                        moveTo(15.0f, 30.6f)
                        lineTo(30.0f, 30.6f)
                        moveTo(22.5f, 16.1f)
                        lineTo(22.5f, 21.1f)
                        moveTo(20.0f, 18.6f)
                        lineTo(25.0f, 18.6f)
                    }
                }
                .build()
        return _chessBdt45!!
    }

private var _chessBdt45: ImageVector? = null
