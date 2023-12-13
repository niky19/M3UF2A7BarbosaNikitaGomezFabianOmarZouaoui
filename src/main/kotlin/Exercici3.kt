/*
3. Escriu una funció anomenada “roman” al que se li passa un número enter
entre 1 i 3999 i retorni un String amb el seu valor en números romans.
 */

//TODO("mejorar la interfaz")
data class RomanNumber(val arabic: Int, val roman: String)

fun roman(num: Int): String {
    println("Introdueix un número entre 1 i 3999")
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
    return resultRoman
}

fun main() {
    println(roman(3999))
}