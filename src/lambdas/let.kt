package lambdas

fun main(args: Array<String>) {
    val listWithNulls: List<String?> = listOf("A", null, "B", null);

    for (item in listWithNulls) {
        item?.let {
            println(it);
        }
    }
}