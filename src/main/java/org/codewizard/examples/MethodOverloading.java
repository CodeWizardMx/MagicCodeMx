package org.codewizard.examples;

public class MethodOverloading {

    public int suma(final int a, final int b) {
        return a + b;
    }

    public int suma(final int a, final int b, final int c) {
        return a + b + c;
    }

    public float suma(final float a, final float b) {
        return a + b;
    }


    public static void examples() {
        MethodOverloading overloading = new MethodOverloading();

       System.out.println("Suma de dos enteros: " + overloading.suma(5, 10));

       // System.out.println("Suma de tres enteros: " + overloading.suma(5, 10, 15));

       // System.out.println("Suma de dos flotantes: " + overloading.suma(5.5f, 10.2f));
    }
}
