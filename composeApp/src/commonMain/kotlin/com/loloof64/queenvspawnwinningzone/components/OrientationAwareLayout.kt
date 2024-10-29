package com.loloof64.queenvspawnwinningzone.components

import androidx.compose.runtime.*

@Composable
expect fun OrientationAwareLayout(portraitContent: @Composable () -> Unit,
                                  landscapeContent: @Composable () -> Unit,
                                  squareContent: @Composable () -> Unit)

@Composable
fun getComponentFromSize(width: Int, height: Int,portraitContent: @Composable () -> Unit,
                         landscapeContent: @Composable () -> Unit,
                         squareContent: @Composable () -> Unit) {
    return when {
        width.toFloat() / height < 0.8f -> portraitContent()
        width.toFloat() / height > 1.2f -> landscapeContent()
        else -> squareContent()
    }
}