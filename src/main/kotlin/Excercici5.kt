fun main(){
    titol("Titol Exemple")
}

/**
 * @author Fabián Gómez
 * @date 13/12/2023
 * Centra cualsevol text en una lìnea de 80 caracters més el mateix text.
 * @see titol
 */

fun titol(text:String){
    var espais = "                                          "
    var amplada =kotlin.math.round((80.0 - text.length) / 2).toInt()
    println(espais.substring(amplada) + text + espais.substring(amplada))
}