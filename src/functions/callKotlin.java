package functions;

import kotlin.collections.CollectionsKt;
import java.util.ArrayList;

public class callKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("João", "Maria");
        System.out.println(SecondListKt.secondOrNull(list));
    }
}
