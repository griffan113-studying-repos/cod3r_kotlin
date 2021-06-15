package lambdas

class Product(val name: String, val price: Double);

public val scolarMaterial = listOf<Product>(
    Product("Lápis de Cor", 10.90),
    Product("Boracha", 1.90),
    Product("MP5", 3599.00),
)

fun main(args: Array<String>) {
    val total = { total: Double, actual: Double -> total + actual };
    val totalPrice: Double = scolarMaterial.map { it.price }.reduce(total);

    println("O preço médio é: ${totalPrice / scolarMaterial.size}");
}