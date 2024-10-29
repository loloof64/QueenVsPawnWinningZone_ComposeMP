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
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = Butt,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(9.0f, 39.3f)
                        lineTo(36.0f, 39.3f)
                        lineTo(36.0f, 36.3f)
                        lineTo(9.0f, 36.3f)
                        lineTo(9.0f, 39.3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = Butt,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(12.0f, 36.3f)
                        lineTo(12.0f, 32.3f)
                        lineTo(33.0f, 32.3f)
                        lineTo(33.0f, 36.3f)
                        lineTo(12.0f, 36.3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = Butt,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(11.0f, 14.3f)
                        lineTo(11.0f, 9.3f)
                        lineTo(15.0f, 9.3f)
                        lineTo(15.0f, 11.3f)
                        lineTo(20.0f, 11.3f)
                        lineTo(20.0f, 9.3f)
                        lineTo(25.0f, 9.3f)
                        lineTo(25.0f, 11.3f)
                        lineTo(30.0f, 11.3f)
                        lineTo(30.0f, 9.3f)
                        lineTo(34.0f, 9.3f)
                        lineTo(34.0f, 14.3f)
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(34.0f, 14.3f)
                        lineTo(31.0f, 17.3f)
                        lineTo(14.0f, 17.3f)
                        lineTo(11.0f, 14.3f)
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = Butt,
                        strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(31.0f, 17.3f)
                        lineTo(31.0f, 29.8f)
                        lineTo(14.0f, 29.8f)
                        lineTo(14.0f, 17.3f)
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd,
                    ) {
                        moveTo(31.0f, 29.8f)
                        lineTo(32.5f, 32.3f)
                        lineTo(12.5f, 32.3f)
                        lineTo(14.0f, 29.8f)
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
                        moveTo(11.0f, 14.3f)
                        lineTo(34.0f, 14.3f)
                    }
                }
                .build()
        return _chessRlt45!!
    }

private var _chessRlt45: ImageVector? = null
