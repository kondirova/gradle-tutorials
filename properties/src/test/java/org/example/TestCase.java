package org.example;

import org.junit.jupiter.api.Test;

public class TestCase {

    @Test
    public void test() {
        System.out.println("Test property: " + System.getProperty("test.property"));
        System.out.println("Gradle test property: " + System.getProperty("gradle.test.property"));
    }
}
