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
    println(myPila.isFull())
    println(myPila.addtoPile(2))
    println(myPila)
}

 data class Pila(val elements : Array<Int>){

   fun isFull() : Boolean {
       var result = false
       if (elements.size == 10)
           result = true
       return result
 }
     fun addtoPile(valueToAdd : Int){
         for (i in 0..elements.size){
             if (isFull()){
                 elements[0] = valueToAdd
             }
         }

     }
 }

/*
fun afegirNumero(pila: Pila, num: Int): Pila {val pilaAux = pila.elements
    pilaAux[pilaAux.lastIndex] = num
    return Pila(pilaAux)
}
 */
