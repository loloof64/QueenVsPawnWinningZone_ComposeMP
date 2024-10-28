package logic

import components.emptyCell

fun String.toFAN(forBlackTurn: Boolean): String {
    var result = this
    val referenceChars = "NBRQK".toCharArray()

    var firstOccurrenceIndex = -1
    for (i in result.indices) {
        val currentElement = this.toCharArray()[i]
        if (referenceChars.contains(currentElement)) {
            firstOccurrenceIndex = i
            break
        }
    }
    if (firstOccurrenceIndex > -1) {
        val replacement = when (val element = this.toCharArray()[firstOccurrenceIndex]) {
            'N' -> if (forBlackTurn) "\u265e" else "\u2658"
            'B' -> if (forBlackTurn) "\u265d" else "\u2657"
            'R' -> if (forBlackTurn) "\u265c" else "\u2656"
            'Q' -> if (forBlackTurn) "\u265b" else "\u2655"
            'K' -> if (forBlackTurn) "\u265a" else "\u2654"
            else -> throw java.lang.RuntimeException("Unrecognized piece char $element into SAN $this")
        }
        val firstPart = this.substring(0, firstOccurrenceIndex)
        val lastPart = this.substring(firstOccurrenceIndex + 1)

        result = "$firstPart$replacement$lastPart"
    }
    return result
}

fun positionFenToPiecesArray(positionFen: String): List<List<Char>> {
    return positionFen.split(" ")[0].split('/').map { line ->
        line.flatMap { value ->
            if (value.isDigit()) {
                List(value.digitToInt()) { emptyCell }
            } else {
                listOf(value)
            }
        }.toMutableList()
    }.toMutableList()
}