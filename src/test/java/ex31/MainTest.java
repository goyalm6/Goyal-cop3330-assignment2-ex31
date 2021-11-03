package ex31;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void isNumericShouldReturnTrue() {
        Boolean result = ex31.Main.isNumeric("12");
        assertTrue(result);
    }

    @Test
    void isNumericShouldReturnFalse() {
        Boolean result = ex31.Main.isNumeric("ERE");
        assertFalse(result);
    }

    @Test
    void getHeartRateShouldCalculateRateWhenIntensityIs55() {
        int inputAge = 22;
        int inputRestingPulse = 65;
        int intensity = 55;
        int result = ex31.Main.getHeartRate(inputAge, inputRestingPulse, intensity);
        assertEquals(138, 138);
    }

    @Test
    void getHeartRateShouldCalculateRateWhenIntensityIs65() {
        int inputAge = 22;
        int inputRestingPulse = 65;
        int intensity = 65;
        int result = ex31.Main.getHeartRate(inputAge, inputRestingPulse, intensity);
        assertEquals(151, 151);
    }
}