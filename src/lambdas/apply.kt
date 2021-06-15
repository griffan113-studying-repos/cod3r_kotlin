package lambdas

public class Calculator2 {
    var result = 0;

    fun sum(a: Int, b: Int) {
        result += a + b;
    }

    fun add(a: Int) {
        result += a;
    }
}

fun main(args: Array<String>) {
    val calc = Calculator2();

    calc.apply { sum(4, 5) }.apply { add(5) }.apply { println(result) };

    calc.apply {
        sum(4, 5);
        add(5);
        println(result);
    }
}