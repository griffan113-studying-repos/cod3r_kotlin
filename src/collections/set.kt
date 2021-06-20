package collections

fun Any.print() = println(this);

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, "3", true, "texto", 3.18);

    conjunto.add(3).print();
    conjunto.add(10).print();
}