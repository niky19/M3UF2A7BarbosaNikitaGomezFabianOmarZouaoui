/*
6. Implementa un programa que faci servir un tipus de dada anomenat “Pila”.
Una pila és un tipus de dada on es van afegint valors i es van traient en l’ordre
invers al qual s’han afegit, també conegut com LIFO (Last In First Out). El
programa ha de presentar el següent menú d’opcions:
1.- Afegir número (push)
2.- Treure número (pop)
3.- Mostrar contingut de la pila
4.- Sortir
La pila ha d’admetre com a màxim 10 valors. Si intentem afegir un onzè
element el sistema no ho ha de permetre i ha d’avisar a l’usuari que la pila es
troba plena. De la mateixa manera, si intentem treure un número d’una pila que
es troba buida, també s’ha d’informar a l’usuari que no pot fer aquesta
operació.
En treure un número de la pila, s’ha de mostrar per pantalla quin és el número
que s’ha tret.
El programa s’ha d’implementar amb un array. No es poden fer servir els tipus
de dades de les llibreries de Kotlin.
 */
fun main() {
    val myPila = Pila(arrayOf(1,2,3,4,5,6,7,8,9,10))
    myPila.push(10)
    myPila.push(20)
    println(myPila)
}

data class Pila(var elements: Array<Int>) {
    fun isFull(): Boolean {
        var result: Boolean
        if (elements.size <= 10) {
            result = true
        } else {
            result = false
        }
        return result
    }

    //Adds a number to the pile
    fun push(numToAdd : Int){
            if (isFull()) {
                pop()
                elements[elements.lastIndex] = numToAdd
                println(elements)
            }
    }

    //Removes last number from the Pile
    fun pop() {
    if (!isFull()) {
        val newArray = Array(elements.size - 1) { 0 }
        for (i in 1..<elements.size) {
            newArray[i - 1] = elements[i]
        }
        elements = newArray
    }
}
}
/*
fun afegirNumero(pila: Pila, num: Int): Pila {val pilaAux = pila.elements
    pilaAux[pilaAux.lastIndex] = num
    return Pila(pilaAux)
}
 */
