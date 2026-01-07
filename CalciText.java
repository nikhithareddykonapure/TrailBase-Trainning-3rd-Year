package fourth.text;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalciTest {

    @Test
    void testSum() {
        Calculator cal = new Calculator();
        Calci c = new Calci(cal);

        int result = c.sum(3, 4);
        assertEquals(7, result);
    }
}

