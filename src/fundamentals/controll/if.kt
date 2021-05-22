package fundamentals.controll;

fun main(args: Array<String>) {
    val nota: Double = 6.6;

    if(nota >= 7)
        println("Aprovado!");

    val aprovado = if(nota >= 7) println("Aprovado!") else println("Reprovado :(");

    println(aprovado);
}