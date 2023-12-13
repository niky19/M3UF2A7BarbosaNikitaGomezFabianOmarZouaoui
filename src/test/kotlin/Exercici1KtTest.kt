import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Exercici1KtTest {
    @Test
    fun quiEsIntegrantDAquestGrupPrimer() {
        val RESULT = "Niki"
        assertEquals(quiEsIntegrantDAquestGrup(1), RESULT)
    }

    @Test
    fun quiEsIntegrantDAquestGrupNoExisteix() {
        val RESULT = "\"\""
        assertEquals(quiEsIntegrantDAquestGrup(4), RESULT)
    }

    @Test
    fun quiEsIntegrantDAquestGrupNegatiu() {
        val RESULT = "\"\""
        assertEquals(quiEsIntegrantDAquestGrup(-1), RESULT)
    }
}