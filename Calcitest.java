package com.example1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class Calcitest {

    @BeforeAll
    static void init() {
        System.out.println("in before all");
    }

    @BeforeEach
    void beforeeach() {
        System.out.println("Before each test");
    }

    @AfterEach
    void aftereach() {
        System.out.println("After each test");	
    }

    @AfterAll
    static void afterall() {
        System.out.println("After All test");
    }

    @Test
    void test() {
        Calci c = new Calci();
        assertEquals(5, c.add(2, 3));
        System.out.println("test");
    }
    @Test
    void test2() {
        Calci c = new Calci();
        assertEquals(5, c.add(2, 3));
        System.out.println("test2");
    }
    
    
}
