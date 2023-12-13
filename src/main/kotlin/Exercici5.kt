/**
 * Rep un String i el mostra centrat en una línia de 80 caràcters.
 * @param text String
 * @author Fabián Gomez, Nikita Barbosa, Omar Zouaoui
 *
 */

//Aquest exercici no té testos perquè és una funció que només mostra per pantalla. Els testos són per comprovar la lógica del codi, no la sortida/entrada per pantalla.
fun titol(text:String){
    var espais = "                                          "
    var amplada = kotlin.math.round((80.0 - text.length) / 2).toInt()
    println(espais.substring(amplada) + text + espais.substring(amplada))
}

fun main(){
    titol("Titol Exemple")
}