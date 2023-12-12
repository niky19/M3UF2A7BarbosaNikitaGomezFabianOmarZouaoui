fun main(){
}

/**
 *
 */

val grup = arrayOf("Niki", "Omar", "Fabian")
fun quiEsIntegrantDAquestGrup(num:Int):String {
    var result = ""
    if (num < grup.size)
        result = grup[num]

    return result
}