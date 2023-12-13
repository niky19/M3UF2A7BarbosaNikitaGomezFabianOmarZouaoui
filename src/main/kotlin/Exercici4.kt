import java.util.Scanner

/**
 * Valida un superusuari
 * @param scan Scanner
 * @param passwordCorrecte String
 * @return String
 * @author Fabián Gomez, Nikita Barbosa, Omar Zouaoui
 */

//A aquest exercici no hem fet testos perquè té interacció amb l'usuari

const val password = "admin"

fun main() {
    val scan = Scanner(System.`in`)
    val resultat = validarSuperusuari(scan, password)
    println(resultat)
}

fun validarSuperusuari(scan: Scanner, passwordCorrecte: String): String {
    var intents = 3
    var result = "Ha superat el nombre d'intents, accés denegat"
    println("Introdueix la contrasenya")
    var intent = scan.nextLine()

    while (intent != passwordCorrecte && intents > 0) {
        intents--
        println("Intent no satisfactori. Li queden $intents intents.")
        if (intents > 0) {
            println("Introdueix la contrasenya")
            intent = scan.nextLine()
        }
    }
    if (intent == passwordCorrecte) {
        result = "Contrasenya correcta, accedint al sistema"
    }

    return result
}



