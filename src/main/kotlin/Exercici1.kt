fun main(){
}

/**
 * @author Fabián Gómez
 * @date 13/12/2023
 * Detecta i mostra el numero de cada integrant del grup.
 * @see quiEsIntegrantDAquestGrup
 */

val grup = arrayOf("Niki", "Omar", "Fabian")
fun quiEsIntegrantDAquestGrup(num:Int):String {
    var result = ""
    if (num < grup.size)
        result = grup[num]

    return result
}