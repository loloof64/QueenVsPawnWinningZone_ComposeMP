import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import org.jetbrains.compose.ui.tooling.preview.Preview
import screens.MainContent

@Composable
@Preview
fun App() {
    MaterialTheme {
        Box(contentAlignment = Alignment.Center) {
            MainContent()
        }
    }
}
