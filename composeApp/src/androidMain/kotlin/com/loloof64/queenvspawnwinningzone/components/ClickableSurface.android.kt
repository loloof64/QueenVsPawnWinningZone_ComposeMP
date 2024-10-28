package com.loloof64.queenvspawnwinningzone.components

import androidx.compose.foundation.clickable
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
actual fun ClickableSurface(modifier: Modifier, clickHandler: () -> Unit, content: @Composable () -> Unit) {
    Surface(
        modifier = modifier.clickable { clickHandler()  },
        content = content
    )
}