package fourth.text;

import static org.junit.jupiter.api.Assertions.*;  // For assertEquals
import static org.mockito.Mockito.*;              // For mock(), when(), verify()

import org.junit.jupiter.api.Test;               // JUnit 5 Test annotation

class CalculatorTest {

    @Test
    void testSumUsingMock() {
        // Create a mock of Calculator
        Calculator cal = mock(Calculator.class);

        // Define behavior: add(3,4) should return 7
        when(cal.add(3, 4)).thenReturn(7);

        // Inject mock into Calci
        Calci c = new Calci(cal);

        // Call method under test
        int result = c.sum(3, 4);

        // Assert expected result
        assertEquals(7, result);

        // Verify that add(3,4) was called on the mock
        verify(cal).add(3, 4);
    }
}
