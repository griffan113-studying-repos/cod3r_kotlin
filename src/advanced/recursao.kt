package advanced

import java.lang.IllegalArgumentException

private fun recursao(number: Int): Int = when(number) {
    in 0..1 -> 1;
    in 2..Int.MAX_VALUE -> number * recursao(number - 1);
    else -> throw IllegalArgumentException("Numero Invalido");
}

fun main(args: Array<String>) {
    print(recursao(5));
}