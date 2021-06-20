package collections

fun main(args: Array<String>) {
    val map = hashMapOf(1 to "Gui", 2 to "Maria", 3 to "Claudia");

    for ((id, nome) in map) {
        println("$id => $nome");
    }
}