import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Exercici3KtTest {
    @Test
    fun roman_NumberFour() {
        val RESULT = "IV"
        assertEquals(roman(4), RESULT)
    }

    @Test
    fun roman_Negative() {
        val RESULT = "No es pot convertir el número a romànic perquè és negatiu"
        assertEquals(roman(-1), RESULT)
    }

    @Test
    fun roman_NumberMaxLimit() {
        val RESULT = "MMMCMXCIX"
        assertEquals(roman(3999), RESULT)
    }
}