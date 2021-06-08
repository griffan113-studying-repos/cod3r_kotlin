package functions

inline fun transation(function: () -> Unit): Unit {
    println("Abrindo transação...");

    try {
        function();
    } finally {
        println("Fechando transação...");
    }
}

fun main(args: Array<String>) {
    transation {
        println("Executando...");
    }
}