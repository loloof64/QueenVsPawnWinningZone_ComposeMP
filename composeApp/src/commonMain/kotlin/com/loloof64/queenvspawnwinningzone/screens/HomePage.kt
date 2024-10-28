package screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import logic.generateExercise
import org.jetbrains.compose.resources.stringResource
import queenvspawnwinningzone.composeapp.generated.resources.Res
import queenvspawnwinningzone.composeapp.generated.resources.exerciceGenerationError
import queenvspawnwinningzone.composeapp.generated.resources.homePageTitle
import queenvspawnwinningzone.composeapp.generated.resources.newGame

@Composable
fun HomePage(
    modifier: Modifier = Modifier,
) {
    val navigator = LocalNavigator.currentOrThrow
    var showProgressBar by rememberSaveable { mutableStateOf(false) }
    var goToGamePageButtonActive by rememberSaveable { mutableStateOf(true) }
    var showGenerationError by rememberSaveable { mutableStateOf(false) }
    var progression by rememberSaveable { mutableStateOf(0.0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(stringResource(Res.string.homePageTitle))
                })
        }
    ) {
        Surface(
            modifier = modifier.background(color = MaterialTheme.colors.background)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Box(contentAlignment = Alignment.Center, modifier = modifier.fillMaxWidth()) {
                    val scope = rememberCoroutineScope()
                    Button(onClick = {
                        scope.launch(Dispatchers.IO) {
                            val outerScope = this
                            progression = 0.0
                            showGenerationError = false
                            goToGamePageButtonActive = false
                            showProgressBar = true
                            val timer = (0..Int.MAX_VALUE)
                                .asSequence()
                                .asFlow()
                                .onEach { delay(1_000) }
                            launch {
                                timer.collect {
                                    if (it >= 5) {
                                        progression = 0.0
                                        showProgressBar = false
                                        goToGamePageButtonActive = true
                                        showGenerationError = true
                                        outerScope.cancel()
                                        this.cancel()
                                    }
                                }
                            }
                            val exercise = generateExercise(onProgression = {
                                progression = it
                            })
                            progression = 0.0
                            showProgressBar = false
                            goToGamePageButtonActive = true
                            navigator.push(Game(exercise = exercise))
                        }
                    }, enabled = goToGamePageButtonActive) {
                        Text(stringResource(Res.string.newGame))
                    }
                    if (showProgressBar) {
                        CircularProgressIndicator(modifier = Modifier.size(40.dp), progress = progression.toFloat())
                    }
                }
                if (showGenerationError) {
                    Text(stringResource(Res.string.exerciceGenerationError), color = Color.Red)
                }
            }
        }
    }
}
