package collections

fun main(args: Array<String>) {
    val numbers = arrayListOf<Int>(1, 2, 3, 4, 5);
    val strings = arrayListOf<String>("Eliel", "Pedro", "José", "Paulo");

    val union = numbers + strings;

    print(union);
}