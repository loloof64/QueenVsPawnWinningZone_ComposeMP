package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import components.ChessBoard
import components.SolutionLegend
import com.loloof64.queenvspawnwinningzone.components.OrientationAwareLayout
import logic.Exercise
import logic.Solution
import org.jetbrains.compose.resources.stringResource
import queenvspawnwinningzone.composeapp.generated.resources.Res
import queenvspawnwinningzone.composeapp.generated.resources.goBack
import queenvspawnwinningzone.composeapp.generated.resources.solutionPageTitle
import queenvspawnwinningzone.composeapp.generated.resources.swapBoardOrientation
import vectors.material_vectors.ArrowBack
import vectors.material_vectors.SwapVert

@Composable
fun SolutionPage(
    exercise: Exercise,
    solution: Solution,
    modifier: Modifier = Modifier,
) {
    var reversed by rememberSaveable { mutableStateOf(!exercise.isWhiteTurn) }
    val navigator = LocalNavigator.currentOrThrow

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navigator.pop() }) {
                        Image(
                            imageVector = ArrowBack,
                            contentDescription = stringResource(Res.string.goBack),
                            modifier = Modifier.size(30.dp),
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                    }
                },
                title = {
                    Text(stringResource(Res.string.solutionPageTitle))
                }, actions = {
                    IconButton(onClick = {
                        reversed = !reversed
                    }) {
                        Image(
                            imageVector = SwapVert,
                            contentDescription = stringResource(Res.string.swapBoardOrientation),
                            modifier = Modifier.size(30.dp),
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                    }
                })
        }
    ) {
        Surface(
            modifier = modifier.background(color = MaterialTheme.colors.background)
        ) {
            OrientationAwareLayout(
                landscapeContent = {
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = modifier.fillMaxSize()) {
                        Content(exercise = exercise, solution = solution, reversed = reversed, legendTextSize = 14.sp)
                    }
                },
                portraitContent = {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.fillMaxSize()) {
                        Content(exercise = exercise, solution = solution, reversed = reversed, legendTextSize = 14.sp)
                    }
                }, squareContent = {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.fillMaxSize()) {
                        Content(
                            boardModifier = Modifier.fillMaxSize(0.80f),
                            exercise = exercise,
                            solution = solution,
                            reversed = reversed,
                            legendTextSize = 10.sp
                        )
                    }
                }
            )

        }
    }
}

@Composable
fun Content(
    boardModifier: Modifier = Modifier,
    exercise: Exercise,
    solution: Solution,
    reversed: Boolean,
    legendTextSize: TextUnit
) {
    val isWhiteTurn by rememberSaveable { mutableStateOf(exercise.isWhiteTurn) }
    ChessBoard(
        modifier = boardModifier.padding(5.dp),
        piecesValues = exercise.pieces,
        isWhiteTurn = isWhiteTurn,
        reversed = reversed,
        selectedCellsSerialized = "",
        solution = solution,
        onCellClicked = { _, _ ->

        }
    )
    SolutionLegend(modifier = Modifier.fillMaxSize(), textSize = legendTextSize)
}