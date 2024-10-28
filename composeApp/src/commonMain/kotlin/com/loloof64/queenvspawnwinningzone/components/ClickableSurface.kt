package com.loloof64.queenvspawnwinningzone.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun ClickableSurface(
    modifier: Modifier = Modifier,
    clickHandler: () -> Unit,
    content: @Composable () -> Unit
)