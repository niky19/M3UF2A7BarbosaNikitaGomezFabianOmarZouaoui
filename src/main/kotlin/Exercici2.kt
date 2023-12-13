/**
 * Calcula el preu amb IVA d'un producte en funció del tipus d'IVA i la data de compra
 * @param preuSenseIVA Double
 * @param tipusIVA TipusdeIVA
 * @param dataCompra LocalDate
 * @return Double
 * @author Fabián Gomez, Nikita Barbosa, Omar Zouaoui
 **/

import java.text.SimpleDateFormat
import java.util.*

enum class TipusIVA(
    val dataIniciVigencia: Date,
    val preuGeneral: Double,
    val preuReduit: Double,
    val preuSuperreduit: Double,
    val preuExempt: Double
) {
    INICIAL(parseDate("01-01-1986"), 0.12, 0.06, 0.0, 0.0), ANY_1992(
        parseDate("01-01-1992"),
        0.15,
        0.06,
        0.0,
        0.0
    ),
    ANY_1993(parseDate("01-01-1993"), 0.15, 0.06, 0.03, 0.0), ANY_1995(
        parseDate("01-01-1995"),
        0.16,
        0.07,
        0.04,
        0.0
    ),
    ANY_2010(parseDate("01-01-2010"), 0.18, 0.08, 0.04, 0.0), JULIOL_2012(parseDate("15-07-2012"), 0.21, 0.1, 0.04, 0.0)
}

/**
 * @author Omar
 * @since 13/12/2023
 * ## Que fa la funció?
 * la funció utilitza el métode parseDate per a fer mes facil la utilització de dates
 * @param dateString: String a formatear en dia, més i any
 * @return un tipus Date formatejat en dia, mes i any
 **/
fun parseDate(dateString: String): Date {
    return SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(dateString)
}
/**
 * @author Omar
 * @since 13/12/2023
 * ## Que fa la funció?
 * Calcula el preu amb IVA sumant el preu base amb el producte del preu i el IVA a la taula del corresponent any
 * @param preu: Preu base amb el que operem
 * @param tipusIVA: el tipus de IVA que es fará servir per ser multiplicat amb el preu
 * @return un INT amb el preu amb IVA
 **/
fun calcularIVA(preu: Double, tipusIVA: TipusIVA): Double {
    val result = preu * tipusIVA.preuGeneral
    return preu + result
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Introdueix el preu sense IVA: ")
    val preuSenseIVA = scanner.nextDouble()
    println(
        """
    Tria el tipus d'IVA: 
    0- INICIAL
    1- ANY_1992
    2- ANY_1993
    3- ANY_1995
    4- ANY_2010
    5- JULIOL_2012
""".trimIndent()
    )

    val opcioTipusIVA = scanner.nextInt()
    val tipusIVA = TipusIVA.entries[opcioTipusIVA]
    val preuAmbIVA = calcularIVA(preuSenseIVA, tipusIVA)

    println(
        """
    Preu sense IVA: $preuSenseIVA
    Tipus d'IVA: $tipusIVA
    Preu amb IVA: $preuAmbIVA
    """.trimIndent()
    )
}
