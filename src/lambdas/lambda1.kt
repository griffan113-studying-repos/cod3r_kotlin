package lambdas

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y };
    println(sum(5, 8));
}