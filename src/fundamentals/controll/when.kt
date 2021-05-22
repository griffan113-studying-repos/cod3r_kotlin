package fundamentals.controll;

fun main(args: Array<String>) {
    val nota: Int = 3;

    when(nota) {
        10, 9 -> System.out.println("Fantástico");
        8, 7 -> System.out.println("Parabéns");
        in 0..3 -> System.out.println("Burro");
        else -> {
            System.out.println("Inválido");
        }
    }
}