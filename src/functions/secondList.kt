package functions

fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this[1] else null;

fun main(args: Array<String>) {
    val list = listOf("João", "Maria");
    println(list.secondOrNull())
}