package functions

// Dessa forma é possível passar um número indeterminada de parâmetros;
fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray();
}

fun main(args: Array<String>) {
    for(n in ordenar(38, 4, 5, 1, 9, 1231, 2, 3)) {
        print("$n ");
    }
}