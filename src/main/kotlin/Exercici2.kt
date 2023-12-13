/*
Escriu una funció anomenada “calcularIVA” a la que se li passa un preu, un
tipus d’IVA i la data de la compra i retorna el preu amb l’IVA aplicat. El tipus
d’IVA pot ser General, Reduït, Superreduït o Exempt. El percentatge a aplicar
és el vigent en la data de compra i el podem trobar en aquesta taula:
 */

import java.text.SimpleDateFormat
import java.util.*

enum class TipusIVA(val dataIniciVigencia: Date, val preuGeneral: Double, val preuReduit: Double, val preuSuperreduit: Double, val preuExempt: Double) {
    INICIAL(parseDate("01-01-1986"), 0.12, 0.06, 0.0, 0.0),
    ANY_1992(parseDate("01-01-1992"), 0.15, 0.06, 0.0, 0.0),
    ANY_1993(parseDate("01-01-1993"), 0.15, 0.06, 0.03, 0.0),
    ANY_1995(parseDate("01-01-1995"), 0.16, 0.07, 0.04, 0.0),
    ANY_2010(parseDate("01-01-2010"), 0.18, 0.08, 0.04, 0.0),
    JULIOL_2012(parseDate("15-07-2012"), 0.21, 0.1, 0.04, 0.0)
}

fun parseDate(dateString: String): Date {
    return SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(dateString)
}

fun calcularIVA(preu: Double, tipusIVA: TipusIVA): Double {
    return preu * tipusIVA.preuGeneral
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Introdueix el preu sense IVA: ")
    val preuSenseIVA = scanner.nextDouble()

    println("Tria el tipus d'IVA (0: INICIAL, 1: ANY_1992, 2: ANY_1993, 3: ANY_1995, 4: ANY_2010, 5: JULIOL_2012): ")
    val opcioTipusIVA = scanner.nextInt()
    val tipusIVA = TipusIVA.values()[opcioTipusIVA]

    val preuAmbIVA = calcularIVA(preuSenseIVA, tipusIVA)

    println("Preu sense IVA: $preuSenseIVA")
    println("Tipus d'IVA: $tipusIVA")
    println("Preu amb IVA: $preuAmbIVA")
}
