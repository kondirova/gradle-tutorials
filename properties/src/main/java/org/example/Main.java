package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Property: " + System.getProperty("main.property"));
        System.out.println("Gradle property: " + System.getProperty("gradle.main.property"));
    }
}
