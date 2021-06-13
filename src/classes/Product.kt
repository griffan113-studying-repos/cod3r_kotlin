package classes

public class Product(var nome: String, private var preco: Double, var desconto: Double, var ativo: Boolean) {
    public val inativo: Boolean get() = !ativo;
    public val precoComDesconto: Double get() = preco * (1 - desconto);
}

fun main(args: Array<String>) {
    val p1 = Product("Ipad", 2399.00, 0.59, true);
    println(p1.precoComDesconto);
}