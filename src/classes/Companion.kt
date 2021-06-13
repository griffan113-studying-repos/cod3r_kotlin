package classes;

public class Companion(val name: String, var price: Double) {
    public companion object {
        public fun create(name: String, price: Double) = Companion(name, price)
        @JvmStatic
        var discount: Double = 0.0;
    }

    fun priceWithDiscount(): Double {
        return price - price * discount;
    }
}

fun main(args: Array<String>) {
    val item1 = Companion.create("FIlme", 10.99);
    val item2 = Companion("Nada", 800.00);
}