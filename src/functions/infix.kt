package functions

class Produto(val nome: String, val preco: Double);

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco;

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 2339.00);
    val p2 = Produto("Borracha", 2.00);

    println(p1 maisCaroQue p2);
}