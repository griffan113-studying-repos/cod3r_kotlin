package lambdas

data class Student(val nome: String, val grade: Double);

fun main(args: Array<String>) {
    val students = arrayListOf<Student>(
        Student("Pedro", 7.4),
        Student("João", 4.3),
        Student("Rafael", 9.8),
    );

    val aprooved = students.filter { it.grade >= 7.0 };

    println(aprooved);
}