import java.util.*

//Comprobación de input de tipo Int
fun checkInt(sc: Scanner): Int {
    while (true) {
        println("Introdueix un enter:")
        if (sc.hasNextInt()) {
            return sc.nextInt()
        } else {
            println("No és un enter. Introdueix un enter:")
            sc.next()
        }
    }
}
//Comprobación de input de tipo Double
fun checkDouble(sc: Scanner): Double {
    while (true) {
        println("Introdueix un enter:")
        if (sc.hasNextDouble()) {
            return sc.nextDouble()
        } else {
            println("No és un enter. Introdueix un enter:")
            sc.next()
        }
    }
}