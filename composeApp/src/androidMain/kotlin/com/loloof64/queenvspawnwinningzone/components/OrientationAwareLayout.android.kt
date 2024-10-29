package com.loloof64.queenvspawnwinningzone.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

@Composable
actual fun OrientationAwareLayout(
    portraitContent: @Composable () -> Unit,
    landscapeContent: @Composable () -> Unit,
    squareContent: @Composable () -> Unit
) {
    val configuration = LocalConfiguration.current
    val width = configuration.screenWidthDp
    val height = configuration.screenHeightDp

    getComponentFromSize(width, height, portraitContent, landscapeContent, squareContent)
}