import java.util.*

/**
 * Returns a roman number from an arabic number
 * @param num Int
 * @return String
 * @author Nikita Barbosa, Fabián Gómez,
 */

data class RomanNumber(val arabic: Int, val roman: String)

fun roman(num: Int): String {
    var result = ""
    if (num < 0) {
        result = "No es pot convertir el número a romànic perquè és negatiu"
    } else {
        val ROMAN_NUMBER_OPTIONS = listOf(
            RomanNumber(1, "I"),
            RomanNumber(4, "IV"),
            RomanNumber(5, "V"),
            RomanNumber(9, "IX"),
            RomanNumber(10, "X"),
            RomanNumber(40, "XL"),
            RomanNumber(50, "L"),
            RomanNumber(90, "XC"),
            RomanNumber(100, "C"),
            RomanNumber(400, "CD"),
            RomanNumber(500, "D"),
            RomanNumber(900, "CM"),
            RomanNumber(1000, "M")
        )
        var remainingNumber = num
        var resultRoman = ""
        var availableIndexes = ROMAN_NUMBER_OPTIONS.lastIndex
        while (remainingNumber > 0) {
            if (remainingNumber >= ROMAN_NUMBER_OPTIONS[availableIndexes].arabic) {
                resultRoman += ROMAN_NUMBER_OPTIONS[availableIndexes].roman
                remainingNumber -= ROMAN_NUMBER_OPTIONS[availableIndexes].arabic
            } else {
                availableIndexes--
            }
        }
        result = resultRoman
    }
    return result
}
fun main() {
    val sc = Scanner(System.`in`)
    val userNum = checkInt(sc)
    println(roman(userNum))
}