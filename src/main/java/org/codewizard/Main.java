package org.codewizard;

import org.codewizard.examples.MethodOverloading;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {


        SpringApplication.run(Main.class, args);

        MethodOverloading.examples();

    }
}
