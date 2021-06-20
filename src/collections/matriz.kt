package collections

fun main(args: Array<String>) {
    var matriz = Array(3) { arrayOfNulls<Int>(3) };

    matriz[0][0] = 1;
    matriz [0][1] = 2;
    matriz[0][2] = 3;
    matriz [1] [0] = 4;
    matriz[1] [1] = 5;
    matriz[1] [2] = 6;
    matriz[2][0] = 7;
    matriz[2][1] = 8;
    matriz [2] [2] = 9;

    for ((linha, valorLinha) in matriz.withIndex()) {
        for ((coluna, valorColuna) in valorLinha.withIndex()) {
            println("[$linha] - [$coluna] -> ${matriz[linha][coluna]}");
        }
    }

    matriz.forEach { linha ->
        linha.forEach { item ->
            println(item);
        }
    }
}