package com.loloof64.queenvspawnwinningzone.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalWindowInfo

@OptIn(ExperimentalComposeUiApi::class)
@Composable
actual fun OrientationAwareLayout(
    portraitContent: @Composable () -> Unit,
    landscapeContent: @Composable () -> Unit,
    squareContent: @Composable () -> Unit
) {
    val windowState = LocalWindowInfo.current
    val width = windowState.containerSize.width
    val height = windowState.containerSize.height

    getComponentFromSize(width, height, portraitContent, landscapeContent, squareContent)
}