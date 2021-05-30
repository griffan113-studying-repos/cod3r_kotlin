package fundamentals.operators

data class Car(val branch: String, val model: String)

fun main(args: Array<String>) {
    val (marca, modelo) = Car("Ford", "Fusion");

    val (marido, mulher) = listOf("joão", "maria");
}