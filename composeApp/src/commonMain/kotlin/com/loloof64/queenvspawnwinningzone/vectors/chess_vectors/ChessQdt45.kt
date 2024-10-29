package com.loloof64.queenvspawnwinningzone.vectors.chess_vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

val ChessQdt45: ImageVector
    get() {
        if (_chessQdt45 != null) {
            return _chessQdt45!!
        }
        _chessQdt45 =
            Builder(
                    name = "ChessQdt45",
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
                        pathFillType = NonZero,
                    ) {
                        moveTo(9.0f, 26.0f)
                        curveTo(17.5f, 24.5f, 30.0f, 24.5f, 36.0f, 26.0f)
                        lineTo(38.5f, 13.5f)
                        lineTo(31.0f, 25.0f)
                        lineTo(30.7f, 10.9f)
                        lineTo(25.5f, 24.5f)
                        lineTo(22.5f, 10.0f)
                        lineTo(19.5f, 24.5f)
                        lineTo(14.3f, 10.9f)
                        lineTo(14.0f, 25.0f)
                        lineTo(6.5f, 13.5f)
                        lineTo(9.0f, 26.0f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveToRelative(9.0f, 26.0f)
                        curveToRelative(0.0f, 2.0f, 1.5f, 2.0f, 2.5f, 4.0f)
                        curveToRelative(1.0f, 1.5f, 1.0f, 1.0f, 0.5f, 3.5f)
                        curveToRelative(-1.5f, 1.0f, -1.0f, 2.5f, -1.0f, 2.5f)
                        curveToRelative(-1.5f, 1.5f, 0.0f, 2.5f, 0.0f, 2.5f)
                        curveToRelative(6.5f, 1.0f, 16.5f, 1.0f, 23.0f, 0.0f)
                        curveToRelative(0.0f, 0.0f, 1.5f, -1.0f, 0.0f, -2.5f)
                        curveToRelative(0.0f, 0.0f, 0.5f, -1.5f, -1.0f, -2.5f)
                        curveToRelative(-0.5f, -2.5f, -0.5f, -2.0f, 0.5f, -3.5f)
                        curveToRelative(1.0f, -2.0f, 2.5f, -2.0f, 2.5f, -4.0f)
                        curveToRelative(-8.5f, -1.5f, -18.5f, -1.5f, -27.0f, 0.0f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(11.5f, 30.0f)
                        curveTo(15.0f, 29.0f, 30.0f, 29.0f, 33.5f, 30.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveToRelative(12.0f, 33.5f)
                        curveToRelative(6.0f, -1.0f, 15.0f, -1.0f, 21.0f, 0.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(6.0f, 12.0f)
                        moveToRelative(-2.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(14.0f, 9.0f)
                        moveToRelative(-2.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(22.5f, 8.0f)
                        moveToRelative(-2.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(31.0f, 9.0f)
                        moveToRelative(-2.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(39.0f, 12.0f)
                        moveToRelative(-2.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = Butt,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(11.0f, 38.5f)
                        arcTo(35.0f, 35.0f, 1.0f, false, false, 34.0f, 38.5f)
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFFFFFFFF)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(11.0f, 29.0f)
                        arcTo(35.0f, 35.0f, 1.0f, false, true, 34.0f, 29.0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFFFFFFFF)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(12.5f, 31.5f)
                        lineTo(32.5f, 31.5f)
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFFFFFFFF)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(11.5f, 34.5f)
                        arcTo(35.0f, 35.0f, 1.0f, false, false, 33.5f, 34.5f)
                    }
                    path(
                        fill = SolidColor(Color(0xFFFFFFFF)),
                        stroke = SolidColor(Color(0xFFFFFFFF)),
                        strokeLineWidth = 1.5f,
                        strokeLineCap = strokeCapRound,
                        strokeLineJoin = strokeJoinRound,
                        strokeLineMiter = 4.0f,
                        pathFillType = NonZero,
                    ) {
                        moveTo(10.5f, 37.5f)
                        arcTo(35.0f, 35.0f, 1.0f, false, false, 34.5f, 37.5f)
                    }
                }
                .build()
        return _chessQdt45!!
    }

private var _chessQdt45: ImageVector? = null
