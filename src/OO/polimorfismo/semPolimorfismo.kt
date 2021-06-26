package OO.polimorfismo

//public open class Person() {
//    public fun code() {
//        println("Coding!");
//    }
//}
//
//public class Me() : Person() {
//    public var alive = true;
//}
//
//fun main(args: Array<String>) {
//    while(Me().alive) Me().code();
//}

public class Feijao2(val peso: Double);

public class Arroz2(val peso: Double);

public class Pessoa2(var peso: Double) {
    public fun comer(feijao: Feijao2) {
        peso += feijao.peso;
    }

    public fun comer(arroz: Arroz2) {
        peso += arroz.peso;
    }
}

fun main(args: Array<String>) {
    val feijao = Feijao2(0.3);
    val arroz = Arroz2(0.2);

    val joao = Pessoa2(70.5);
    joao.comer(feijao);
    joao.comer(arroz);

    when {
        joao.peso >= 75.0 -> System.out.println("Gordo");
        else -> {
            System.out.println("Magro");
        }
    }
}