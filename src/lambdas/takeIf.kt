package functions

fun main(args: Array<String>) {
    println("Digite sua mensagem: ");

    val input = readLine();
    val message = input.takeIf { it?.trim() != "" } ?: "Sem mensagem";

    println(message);
}