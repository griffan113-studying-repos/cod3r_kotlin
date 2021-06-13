package classes

enum class WeekDay {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, FRIDAY, SATURDAY;
}

enum class WeekDay2(val id: Int, var nome: String, val util: Boolean) {
    SUNDAY(1, "Domingo", false);
}

fun main(args: Array<String>) {
    for (day in WeekDay2.values()) {
        println("${day.nome} é um dia ${if (day.util) "útil" else "não útil"}")
    }
}