import java.util.*

/*
1. Escriu una funció anomenada “quiEsIntegrantDAquestGrup” que, rebi com a
paràmetre un número enter i, i retorni el membre i-ésim del grup. Si no hi ha
membre i-ésim ha de tornar una cadena buida.
Exemple: Tenim un grup format per Lluis(1) i Marta(2)
Si demano quiEsIntegrantDAquestGrup(2) m’ha de tornar “Marta”
Si demano quiEsIntegrantDAquestGrup(0) m’ha de tornar “”
Si demano quiEsIntegrantDAquestGrup(3) m’ha de tornar “”
 */

data class Integrant(val nom: String, val id: Int)

fun quiEsIntegrantDAquestGrup2(id: Int): String {
    var result = ""
    val grup = listOf(
        Integrant("Fabian", 1), Integrant("Nikita", 2)
    )
    for (integrant in grup) {
        if (integrant.id == id) {
            result = integrant.nom
        }
    }
    return result
}
fun main(){

    println(quiEsIntegrantDAquestGrup2(2))
}


