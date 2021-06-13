package lambdas

fun main(args: Array<String>) {
    val students = arrayListOf<String>("Pedro", "João", "Cleber");
    students.map { it.uppercase() }.apply { println(this) };
}