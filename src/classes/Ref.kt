package classes

data class Car(
    var branch: String,
    var model: String,
    var speed: Int = 0
)

fun reference(car: Car) {
    car.speed++
}

fun main(args: Array<String>) {
    var car1 = Car("Ford", "Fusion", 89000);

    var car2 = car1;

    car2.model = "Edge";

    println(car1);

    car1 = Car("Audi", "A4");

    reference(car1);
    reference(car2);

    println(car1);
}