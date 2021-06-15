package collections

fun main(args: Array<String>) {
    val listMix = arrayListOf("Eliel", true, 1, 3.14);

    for (i in listMix) {
        if (i is String) println(i.uppercase());
        else println(i);
    }
}