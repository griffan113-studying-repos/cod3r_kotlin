package collections

fun main(args: Array<String>) {
    val numeros = Array<Int>(10) { i -> i * 10 };

    for (num in numeros) {
        println(num);
    }
}