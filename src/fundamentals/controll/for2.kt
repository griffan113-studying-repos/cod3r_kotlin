package fundamentals.controll;

/*
 *  Continue: Interrompe prematuramente a repetição e continua executando as próximas;
 *  Break: Sai do laço e vai para a próxima linha depois do laço.
 */

fun main(args: Array<String>) {
    val alunos = arrayListOf("André", "João", "Carla");
    for ((index, item) in alunos.withIndex()) {
        println("${index + 1} - $item");
    }
}