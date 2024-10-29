package components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import common.missedCellColor
import common.rightCellColor
import common.wrongCellColor
import org.jetbrains.compose.resources.stringResource
import queenvspawnwinningzone.composeapp.generated.resources.*

val colorSquaresSize = 12.dp
val legendHorizontalPadding = 10.dp

@Composable
fun SolutionLegend(modifier: Modifier = Modifier, textSize: TextUnit) {
    Column(
        modifier = modifier.padding(horizontal = legendHorizontalPadding),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
    ) {
        SolutionLegendHeader(textSize = textSize)
        SolutionLegendItem(itemColor = rightCellColor, caption = stringResource(Res.string.goodSquare), textSize = textSize)
        SolutionLegendItem(itemColor = wrongCellColor, caption = stringResource(Res.string.wrongSquare), textSize = textSize)
        SolutionLegendItem(itemColor = missedCellColor, caption = stringResource(Res.string.missedSquare), textSize = textSize)
    }
}

@Composable
fun SolutionLegendHeader(textSize: TextUnit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = stringResource(Res.string.legend), fontSize = textSize)
    }
}

@Composable
fun SolutionLegendItem(itemColor: Color, caption: String, textSize: TextUnit) {
    Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
        Surface(modifier = Modifier.size(colorSquaresSize, colorSquaresSize), color = itemColor) {}
        Text(text = caption, fontSize = textSize)
    }
}