/**
 * @author Fabián Gómez, Nikita Barbosa, Omar Zouaoui
 * @date 13/12/2023
 * Mostra per pantalla el nom de l'integrant del grup que ocupa la posició indicada per paràmetre
 */

fun quiEsIntegrantDAquestGrup(num:Int):String {
    val grup = arrayOf("Niki", "Omar", "Fabian")
    var result = ""
    if (num in 1.. grup.size) {
        result = grup[num-1]
    }
    else result = "\"\""
    return result
}

fun main() {
    println("Tenim un equip format per ${quiEsIntegrantDAquestGrup(1)}, ${quiEsIntegrantDAquestGrup(2)} i ${quiEsIntegrantDAquestGrup(3)}")
    println(quiEsIntegrantDAquestGrup(1))
    println(quiEsIntegrantDAquestGrup(2))
    println(quiEsIntegrantDAquestGrup(3))
    println(quiEsIntegrantDAquestGrup(4))
}