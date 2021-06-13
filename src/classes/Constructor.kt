package classes

class Constructor {
    val name: String;
    val genero: String;

    constructor(nome: String, genero: String) {
        this.name = nome;
        this.genero = genero;
    }
}

fun main(args: Array<String>) {
    val constructor = Constructor("E", "Nao binauro");

    println(constructor.genero);
}