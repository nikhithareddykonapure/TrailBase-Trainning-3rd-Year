package ttd.text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ttd.test.Fizzbuzz;

class Fizzbuzztext {

	@Test
    void testFizzBuzz() {
        assertEquals("Fizz Buzz", Fizzbuzz.fizzBuzz(15));
    }
	
	@Test
    void testFizz() {
        assertEquals("Fizz", Fizzbuzz.fizzBuzz(6));
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", Fizzbuzz.fizzBuzz(10));
    }

    @Test
    void testNoFizzBuzz() {
        assertEquals("No Fizz Buzz", Fizzbuzz.fizzBuzz(7));
    }

}
