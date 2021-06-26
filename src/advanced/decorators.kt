package advanced

import collections.print

annotation class Positive
annotation class NotEmpty

public class Pessoa(id: Int, nome: String) {
    @Positive
    var id: Int = id;

    @NotEmpty
    var nome: String = nome;
}

// Reflection
public fun getValue(obj: Any, attName: String): Any {
    val att = obj.javaClass.getDeclaredField(attName);
    val isAccessible = att.isAccessible;

    att.isAccessible = true;
    val value = att.get(obj);
    att.isAccessible = isAccessible;

    return value;
}

public fun validate(obj: Any): List<String> {
    val msgs = ArrayList<String>()

    obj::class.members.forEach { member ->
        member.annotations.forEach{ annotation ->
            val value = getValue(obj, member.name);
            when (annotation) {
                is Positive -> {
                    if (value !is Int || value <= 0) {
                        msgs.add("The value $value isn't positive");
                    }
                }
                is NotEmpty -> {
                    if (value !is String || value.trim().isEmpty()) {
                        msgs.add("The actual value: $value isn't valid");
                    }
                }
            }
        }
    }
    return msgs
}

fun main(args: Array<String>) {
    val obj1 = Pessoa(1, "Jose");

    println(validate(obj1));
}
