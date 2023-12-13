import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    val passwordCorrecte = "Puerta"


    val resultat = validarSuperusuari(scan, passwordCorrecte)


    println(resultat)
}

fun validarSuperusuari(scan: Scanner, passwordCorrecte: String): String {
    var intents = 3

    do {
        println("Introdueix la contrasenya")
        val intent = scan.nextLine()

        if (intent == passwordCorrecte) {
            return "Contrasenya correcta, accedint al sistema"
        } else {
            intents--
            println("Intent no satisfactori, introdueixi de nou. Li queden $intents intents.")
        }

    } while (intents > 0)

    return "Has esgotat tots els intents. Accés denegat."
}



