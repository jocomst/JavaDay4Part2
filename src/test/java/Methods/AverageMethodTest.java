package Methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMethodTest {

    @DisplayName("See if the numbers are summed up")
    @Test
    void sum() {
        assertEquals(12, AverageMethod.sum(3, 5, 4));
    }

    @DisplayName("See if the numbers are averaged")
    @Test
    void average() {
        assertEquals(5.0, AverageMethod.average(4, 5, 6));
    }
}