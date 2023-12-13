import java.util.Scanner

/**
 * Crea, afageix i treu elements d'una pila
 * @property elements Array<Int>
 * @author Nikita Barbosa, Omar Zouaoui, Fabián Gomez
 */

//Aquest exercici no té testos perquè interacciona amb l'usuari

fun main() {
    val sc = Scanner(System.`in`)
    val myPila = Pila(arrayOf())
    chooseOption(sc, myPila)
}

data class Pila(var elements: Array<Int>) {
    fun isFull(): Boolean {
    return elements.size == 10
}

    //Adds a number to the pile
    fun push(numToAdd : Int){
            if (!isFull()) {
                var newElements = Array(elements.size+1){0}
                for (i in 0..elements.lastIndex){
                    println(elements[i])
                    newElements[i] = elements[i]
                }
                newElements[newElements.lastIndex] = numToAdd
                elements = newElements
            }
            else {
                println("La pila està plena. No es pot afegir més elements")
            }
    }

    //Removes first number from the Pile
    fun pop() {
        if(elements.size > 0){
            var newElements = Array(elements.size-1){0}
            for (i in 0..elements.lastIndex-1){
                newElements[i] = elements[i]
            }
            println("S'ha tret el número ${elements[elements.lastIndex]}")
            elements = newElements
        } else {
            println("La pila està buida")
        }
    }
}

fun showMenu(){
    println("""
        1.- Afegir número (push)
        2.- Treure número (pop)
        3.- Mostrar contingut de la pila
        4.- Sortir
    """.trimIndent())
}

fun chooseOption(sc : Scanner, pila: Pila){
    do {
        showMenu()
        val option = readOption(sc)
        when (option) {
            1 -> {
                val numToAdd = checkInt(sc)
                pila.push(numToAdd)
            }
            2 -> {
                pila.pop()
            }
            3 -> {
                println(pila)
            }
        }
    } while (option != 4)
}

fun readOption(sc: Scanner): Int {
    var opcio: Int
    do {
        opcio = checkInt(sc)
        if (opcio !in 1..4) {
            println("Introdueix una opció vàlida")
        }
    } while (opcio !in 1..4)
    return opcio
}


