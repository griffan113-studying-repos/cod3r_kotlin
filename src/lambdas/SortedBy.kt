package lambdas

fun main(args: Array<String>) {
    val names = arrayListOf<String>("Renata", "Cleber", "João", "jose");
    val ordered = names.sortedBy { it };

    println(ordered);
}