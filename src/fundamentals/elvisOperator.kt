package fundamentals;

fun main(args: Array<String>) {
    val opcional: String? = null;
    val obrigatorio: String = opcional ?: "Valor padrão";

    println(obrigatorio);
}