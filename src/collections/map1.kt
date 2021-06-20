package collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>();

    map.put(44305417871, "Eliel");
    map.put(26556951862, "Claudia");

    for (par in map) {
        println(par);
    }

    for (nome in map.values) {
        println(nome);
    }

    for (cpf in map.keys) {
        println(cpf);
    }

    for ((cpf, nome) in map) {
        println("$cpf => $nome");
    }
}