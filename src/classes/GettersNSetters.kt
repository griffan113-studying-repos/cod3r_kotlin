package classes

class Cliente {
    constructor(name: String) {
        this.name = name;
    }

    var name: String
        get() = "Meu nome é ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo";
        }
}

fun main(args: Array<String>) {
    val c1 = Cliente("");

    println(c1.name)
}