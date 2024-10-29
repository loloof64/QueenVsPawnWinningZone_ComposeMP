import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.loloof64.queenvspawnwinningzone.vectors.chess_vectors.*
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun MagentaBackground(childContent: @Composable () -> Unit) {
    Surface(modifier = Modifier.size(300.dp), color = Color.Magenta) {
        childContent()
    }
}


@Preview
@Composable
fun WhitePawn() {
    MagentaBackground {
        Image(
            imageVector = ChessPlt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
        )
    }
}

@Preview
@Composable
fun WhiteKnight() {
    MagentaBackground {
        Image(
            imageVector = ChessNlt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            )
        }
}

@Preview
@Composable
fun WhiteBishop() {
    MagentaBackground {
        Image(
            imageVector = ChessBlt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            )
        }
}

@Preview
@Composable
fun WhiteRook() {
    MagentaBackground {
        Image(
            imageVector = ChessRlt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            )
        }
}

@Preview
@Composable
fun WhiteQueen() {
    MagentaBackground {
        Image(
            imageVector = ChessQlt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            )
        }
}

@Preview
@Composable
fun WhiteKing() {
    MagentaBackground {
        Image(
            imageVector = ChessKlt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            )
        }
}

@Preview
@Composable
fun BlackPawn() {
    MagentaBackground {
        Image(
            imageVector = ChessPdt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            )
        }
}

@Preview
@Composable
fun BlackKnight() {
    MagentaBackground {
        Image(
            imageVector = ChessNdt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            )
        }
}

@Preview
@Composable
fun BlackBishop() {
    MagentaBackground {
        Image(
            imageVector = ChessBdt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            )
        }
}

@Preview
@Composable
fun BlackRook() {
    MagentaBackground {
        Image(
            imageVector = ChessRdt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
        )
    }
}

@Preview
@Composable
fun BlackQueen() {
    MagentaBackground {
        Image(
            imageVector = ChessQdt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            )
        }
}

@Preview
@Composable
fun BlackKing() {
    MagentaBackground {
        Image(
            imageVector = ChessKdt45,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            )
        }
}