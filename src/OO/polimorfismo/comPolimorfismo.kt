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

public open class Comida(val peso: Double)

public class Feijao(peso: Double) : Comida(peso);
public class Arroz(peso: Double) : Comida(peso);

public class Pessoa(var peso: Double) {
    public fun comer(comida: Comida) {
        peso += comida.peso;
    }
}

fun main(args: Array<String>) {
    val feijao = Feijao(0.3);
    val arroz = Arroz(0.2);

    val joao = Pessoa(70.5);
    joao.comer(feijao);
    joao.comer(arroz);

    when {
        joao.peso >= 75.0 -> System.out.println("O peso de Joõa é ${joao.peso} ele é Gordo");
        else -> {
            System.out.println("O peso de Joõa é ${joao.peso} ele é Magro");
        }
    }
}