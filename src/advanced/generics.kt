package advanced

import collections.print

public class Caixa<T>(val objeto: T) {
    private val objetos = ArrayList<T>();

    init {
        this.adicionar(objeto)
    }

    public fun adicionar(novoObjeto: T) {
        objetos.add(novoObjeto);
    }

    public override fun toString(): String {
        return objetos.toString();
    }
}

fun main(args: Array<String>) {
    val materialEscolar = Caixa<String>("Caneta");
    materialEscolar.adicionar("Borracha");
    materialEscolar.adicionar("Lápis");

    materialEscolar.print();
}