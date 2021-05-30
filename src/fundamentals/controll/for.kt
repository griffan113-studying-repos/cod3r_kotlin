package fundamentals.controll;

fun tabuada(number: Int) {
    for (i in 0..number * 10 step number) {
        println(i);
    }
}

fun main(args: Array<String>) { //Itera de 1 até 10 crescendo;
    for (i in 1..10) {
        println(i);
    }

    for (i in 10 downTo 5) { //Itera de 10 até 5 decrescendo;
        println(i);
    }

    tabuada(3);
}