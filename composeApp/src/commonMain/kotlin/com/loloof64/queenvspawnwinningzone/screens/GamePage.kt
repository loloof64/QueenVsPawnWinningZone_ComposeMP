package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import components.ChessBoard
import logic.Cell
import logic.Exercise
import logic.SelectedCells
import logic.solve
import org.jetbrains.compose.resources.stringResource
import queenvspawnwinningzone.composeapp.generated.resources.Res
import queenvspawnwinningzone.composeapp.generated.resources.gamePageTitle
import queenvspawnwinningzone.composeapp.generated.resources.swapBoardOrientation
import queenvspawnwinningzone.composeapp.generated.resources.validate
import vectors.material_vectors.SwapVert

@Composable
fun GamePage(
    modifier: Modifier = Modifier,
    exercise: Exercise,
) {
    val isWhiteTurn by rememberSaveable { mutableStateOf(exercise.isWhiteTurn) }
    var reversed by rememberSaveable { mutableStateOf(!exercise.isWhiteTurn) }
    var selectedCells = rememberSaveable(saver = SelectedCells.saver) { SelectedCells() }
    var selectedCellsSerialized by remember { mutableStateOf(selectedCells.serialized) }

    val navigator = LocalNavigator.currentOrThrow

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(stringResource(Res.string.gamePageTitle))
                }, actions = {
                    IconButton(onClick = {
                        reversed = !reversed
                    }) {
                        Image(
                            imageVector = SwapVert,
                            contentDescription = stringResource(Res.string.swapBoardOrientation),
                            modifier = Modifier.size(30.dp),
                            colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.White)
                        )
                    }
                })
        }
    ) {
        Surface(
            modifier = modifier.background(color = MaterialTheme.colors.background)
        ) {
            Row(modifier = modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
                ChessBoard(
                    piecesValues = exercise.pieces,
                    isWhiteTurn = isWhiteTurn,
                    reversed = reversed,
                    selectedCellsSerialized = selectedCellsSerialized,
                    onCellClicked = { file, rank ->
                        val clickedCell = Cell(file = file, rank = rank)
                        selectedCells = selectedCells.toggleCell(clickedCell)
                        selectedCellsSerialized = selectedCells.serialized
                    }
                )
                Surface(modifier = Modifier.fillMaxSize()) {
                    Box(contentAlignment = Alignment.Center) {
                        Button(onClick = {
                            val solution = solve(exercise = exercise, selectedCells = selectedCells.values)
                            navigator.replace(Solution(solutionData = solution, exercise = exercise))
                        }) {
                            Text(stringResource(Res.string.validate))
                        }
                    }
                }
            }
        }
    }
}