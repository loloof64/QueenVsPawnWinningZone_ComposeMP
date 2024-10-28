package com.loloof64.queenvspawnwinningzone.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.onClick
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalFoundationApi::class)
@Composable
actual fun ClickableSurface(modifier: Modifier, clickHandler: () -> Unit, content: @Composable () -> Unit) {
    Surface(
        modifier = modifier.onClick { clickHandler() },
        content = content
    )
}