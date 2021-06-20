package collections

public data class Fruta(var nome: String, var preco: Double);

public fun main(args: Array<String>) {
    val frutas = arrayListOf<Fruta>(
        Fruta("Maça", 1.00),
        Fruta("Banana", 3.00),
    );

    for (fruta in frutas) {
        println("${fruta.nome} o preço é ${fruta.preco}");
    }
}