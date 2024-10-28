package components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import com.loloof64.queenvspawnwinningzone.components.ClickableSurface
import common.*
import logic.*
import org.jetbrains.compose.resources.stringResource
import queenvspawnwinningzone.composeapp.generated.resources.*
import vectors.chess_vectors.*

const val emptyCell = ' '

@Composable
fun ChessBoard(
    piecesValues: List<List<Char>>,
    isWhiteTurn: Boolean,
    reversed: Boolean,
    selectedCellsSerialized: String,
    solution: Solution = Solution(listOf(), listOf(), listOf()),
    onCellClicked: (CellFile, CellRank) -> Unit = { _, _ -> }
) {
    val bgColor = Color(0xFF9999FF)
    BoxWithConstraints {
        val heightBasedAspectRatio = maxHeight > maxWidth
        val minAvailableSide = if (maxWidth < maxHeight) maxWidth else maxHeight
        val cellSize = minAvailableSide * 0.11f

        Box(
            modifier = Modifier.aspectRatio(1f, heightBasedAspectRatio).background(bgColor)
        ) {
            LowerLayer(
                cellSize = cellSize,
                reversed = reversed,
                piecesValues = piecesValues,
                isWhiteTurn = isWhiteTurn,
                selectedCellsSerialized = selectedCellsSerialized,
                solution = solution,
                onCellClicked = onCellClicked,
            )
        }
    }
}

@Composable
private fun LowerLayer(
    cellSize: Dp,
    reversed: Boolean,
    piecesValues: List<List<Char>>,
    isWhiteTurn: Boolean,
    selectedCellsSerialized: String,
    solution: Solution,
    onCellClicked: (CellFile, CellRank) -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        ChessBoardHorizontalLabels(cellSize = cellSize, whiteTurn = null, reversed = reversed)
        (0..7).forEach { rowIndex ->
            val rank = if (reversed) rowIndex + 1 else 8 - rowIndex
            val rankLabel = "${Char('0'.code + rank)}"
            val firstIsWhite = rowIndex % 2 == 0
            val rowPiecesValues = piecesValues[if (reversed) 7 - rowIndex else rowIndex]
            ChessBoardCellsLine(
                cellSize = cellSize, firstCellWhite = firstIsWhite,
                rankLabel = rankLabel, rowPiecesValues = rowPiecesValues,
                reversed = reversed, onCellClicked = onCellClicked,
                selectedCellsSerialized = selectedCellsSerialized, rowIndex = rowIndex,
                solution = solution,
            )
        }
        ChessBoardHorizontalLabels(cellSize = cellSize, whiteTurn = isWhiteTurn, reversed = reversed)
    }
}

@Composable
private fun ChessBoardCellsLine(
    cellSize: Dp,
    firstCellWhite: Boolean,
    rankLabel: String,
    rowPiecesValues: List<Char>,
    reversed: Boolean,
    rowIndex: Int,
    selectedCellsSerialized: String,
    solution: Solution,
    onCellClicked: (CellFile, CellRank) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val selectedCells = SelectedCells.fromSerialized(selectedCellsSerialized).values


        ChessBoardVerticalLabel(text = rankLabel, cellSize = cellSize)
        (0..7).forEach { colIndex ->
            val cellFile = CellFile.entries[if (reversed) 7 - colIndex else colIndex]
            val cellRank = CellRank.entries[if (reversed) rowIndex else 7 - rowIndex]
            val matchingCell = Cell(file = cellFile, rank = cellRank)
            val isSelected = selectedCells.contains(matchingCell)
            val isGoodCell = solution.correctCells.contains(matchingCell)
            val isWrongCell = solution.wrongCells.contains(matchingCell)
            val isMissedCell = solution.missedCells.contains(matchingCell)

            ChessBoardCell(
                isWhite = if ((colIndex % 2) == 0) firstCellWhite else !firstCellWhite,
                size = cellSize,
                pieceValue = rowPiecesValues[if (reversed) 7 - colIndex else colIndex],
                onCellClicked = onCellClicked,
                file = cellFile,
                rank = cellRank,
                isSelected = isSelected,
                isGoodCell = isGoodCell,
                isWrongCell = isWrongCell,
                isMissedCell = isMissedCell,
            )
        }
        ChessBoardVerticalLabel(text = rankLabel, cellSize = cellSize)
    }
}

@Composable
private fun ChessBoardVerticalLabel(
    modifier: Modifier = Modifier, text: String, cellSize: Dp
) {
    val fontSize = with(LocalDensity.current) {
        (cellSize * 0.3f).toSp()
    }
    Column(
        modifier = modifier.width(cellSize / 2).height(cellSize / 2).background(Color.Transparent),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text, fontWeight = FontWeight.Bold, color = Color.Yellow, fontSize = fontSize)
    }
}

@Composable
private fun ChessBoardHorizontalLabels(
    modifier: Modifier = Modifier, cellSize: Dp, whiteTurn: Boolean?, reversed: Boolean
) {
    val fontSize = with(LocalDensity.current) {
        (cellSize * 0.3f).toSp()
    }
    Row(
        modifier = modifier.fillMaxWidth().height(cellSize / 2)
    ) {
        Row(
            modifier = Modifier.width(cellSize / 2).height(cellSize / 2)
        ) {
            Text(
                text = "", fontWeight = FontWeight.Bold, color = Color.Transparent, fontSize = fontSize
            )
        }
        (0..7).forEach {
            val col = if (reversed) 7 - it else it
            val colLabel = "${Char('A'.code + col)}"
            Row(
                modifier = Modifier.width(cellSize).height(cellSize / 2),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = colLabel,
                    fontWeight = FontWeight.Bold,
                    color = Color.Yellow,
                    fontSize = fontSize,
                    textAlign = TextAlign.Center,
                )
            }
        }
        if (whiteTurn == null) {
            Row(
                modifier = Modifier.width(cellSize / 2).height(cellSize / 2)
            ) {
                Text(
                    text = "", fontWeight = FontWeight.Bold, color = Color.Transparent, fontSize = fontSize
                )
            }
        } else {
            val color = if (whiteTurn) Color.White else Color.Black
            Column(
                modifier = Modifier.width(cellSize / 2).height(cellSize / 2).clip(CircleShape).background(color)
            ) {

            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun ChessBoardCell(
    modifier: Modifier = Modifier,
    isWhite: Boolean,
    size: Dp,
    pieceValue: Char,
    file: CellFile,
    rank: CellRank,
    isSelected: Boolean,
    isGoodCell: Boolean,
    isWrongCell: Boolean,
    isMissedCell: Boolean,
    onCellClicked: (CellFile, CellRank) -> Unit,
) {
    var bgColor = if (isWhite) whiteCellColor else blackCellColor
    if (isSelected) bgColor = selectedColor
    if (isGoodCell) bgColor = rightCellColor
    if (isMissedCell) bgColor = missedCellColor
    if (isWrongCell) bgColor = wrongCellColor

    ClickableSurface(modifier = modifier.size(size), clickHandler =  {
        onCellClicked(file, rank)
    }) {
        Column(modifier = Modifier.background(bgColor)) {
            val noPiece = pieceValue == emptyCell
            if (!noPiece) {
                Image(
                    imageVector = getVectorForPiece(pieceValue),
                    contentDescription = getContentDescriptionForPiece(pieceValue),
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }
    }
}

fun getVectorForPiece(pieceValue: Char): ImageVector {
    return when (pieceValue) {
        'P' -> ChessPlt45
        'N' -> ChessNlt45
        'B' -> ChessBlt45
        'R' -> ChessRlt45
        'Q' -> ChessQlt45
        'K' -> ChessKlt45

        'p' -> ChessPdt45
        'n' -> ChessNdt45
        'b' -> ChessBdt45
        'r' -> ChessRdt45
        'q' -> ChessQdt45
        'k' -> ChessKdt45
        else -> throw IllegalArgumentException("Not recognized piece $pieceValue")
    }
}

@Composable
fun getContentDescriptionForPiece(pieceValue: Char): String {
    return stringResource(when (pieceValue) {
        'P' -> Res.string.whitePawn
        'N' -> Res.string.whiteKnight
        'B' -> Res.string.whiteBishop
        'R' -> Res.string.whiteRook
        'Q' -> Res.string.whiteQueen
        'K' -> Res.string.whiteKing

        'p' -> Res.string.blackPawn
        'n' -> Res.string.blackKnight
        'b' -> Res.string.blackBishop
        'r' -> Res.string.blackRook
        'q' -> Res.string.blackQueen
        'k' -> Res.string.blackKing
        else -> Res.string.emptyCell
    })
}