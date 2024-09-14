package org.codewizard.examples;

import java.util.Optional;

public class OptionalExample {
    public static void examples() {
        // Escenario 1: Optional con un valor no nulo
        Optional<String> presentFruit = Optional.of("Apple");
        System.out.println("Fruta presente: "
                + presentFruit.orElse("No hay fruta"));

        // Escenario 2: Optional con un valor nulo
        Optional<String> absentFruit = Optional.ofNullable(null);
        System.out.println("Fruta ausente: "
                + absentFruit.orElse("No hay fruta"));

        // Escenario 3: Verificación y ejecución de código si el valor está presente
        absentFruit.ifPresent(
                f -> System.out.println("Fruta encontrada: " + f));

        // Escenario 4: Manejo de valores predeterminados usando orElse y orElseGet
        String defaultFruit = absentFruit.orElse("Fruta por defecto");
        System.out.println("Fruta por defecto: " + defaultFruit);

        // Escenario 5: Lanza una excepción si el valor no está presente
        try {
            String fruit = absentFruit.orElseThrow(
                    () -> new IllegalStateException("Fruta no encontrada"));
            System.out.println("Fruta encontrada: " + fruit);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
