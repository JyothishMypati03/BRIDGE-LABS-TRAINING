package JUnitTesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConversionTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(
                32,
                TemperatureConversion.celsiusToFahrenheit(0),
                0.01
        );
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(
                0,
                TemperatureConversion.fahrenheitToCelsius(32),
                0.01
        );
    }

}
