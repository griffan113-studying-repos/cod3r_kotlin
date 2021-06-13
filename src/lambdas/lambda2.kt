package lambdas;

public interface IOperation {
    fun execute(a: Int, b: Int): Int;
}

public class Multiplication : IOperation {
    public override fun execute(a: Int, b: Int): Int {
        return a * b;
    }
}

public class Calculator {
    fun calculate(a: Int, b: Int): Int {
        return a * b;
    }

    fun calculate(a: Int, b: Int, operation: IOperation): Int {
        return operation.execute(a, b);
    }

    fun calcular(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b);
    }
}

fun main(args: Array<String>) {
    val calculator = Calculator();
    val result1 = calculator.calculate(3, 4);
    val result2 = calculator.calculate(4, 5, Multiplication());

    val sub = { a: Int, b: Int -> a - b };

    val result3 = calculator.calcular(5, 6, sub)

    println(result1);
    println(result2);
    println(result3);
}