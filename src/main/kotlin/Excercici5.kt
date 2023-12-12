fun main(){
    titol("Titol Exemple")
}

/**
 *
 */

fun titol(text:String){
    var espais = "                                          "
    var amplada =kotlin.math.round((80.0 - text.length) / 2).toInt()
    println(espais.substring(amplada) + text + espais.substring(amplada))
}