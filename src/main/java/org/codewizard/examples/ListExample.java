package org.codewizard.examples;

import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public static void examples() {
        // Lista Mutable - ArrayList
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Apple");
        mutableList.add("Banana");
        mutableList.add("Orange");
        System.out.println("Lista mutable: "
                + mutableList);

        // Modificar la lista mutable
        mutableList.add("Grapes");
        mutableList.remove("Banana");
        System.out.println("Lista mutable modificada: " + mutableList);

        // Lista Inmutable - List.of()
        List<String> immutableList = List.of("Apple", "Banana", "Orange");
        System.out.println("Lista inmutable: "
                + immutableList);

        // Intentar modificar la lista inmutable (esto lanzará una excepción)
        try {
            immutableList.add("Grapes");
        } catch (UnsupportedOperationException e)
        {
            System.out.println("No se puede " +
                    "modificar la lista inmutable. Excepción: " + e);
        }
    }
}
