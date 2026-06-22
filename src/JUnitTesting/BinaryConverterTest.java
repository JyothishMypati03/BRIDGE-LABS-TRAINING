package JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class BinaryConverterTest {

    @Test
    void test106() {
        assertEquals(
                "00000000000000000000000001101010",
                BinaryConverter.toBinary(106)
        );
    }

    @Test
    void test10() {
        assertEquals(
                "00000000000000000000000000001010",
                BinaryConverter.toBinary(10)
        );
    }

    @Test
    void test255() {
        assertEquals(
                "00000000000000000000000011111111",
                BinaryConverter.toBinary(255)
        );
    }

    @Test
    void test1024() {
        assertEquals(
                "00000000000000000000010000000000",
                BinaryConverter.toBinary(1024)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                "00000000000000000000000000000000",
                BinaryConverter.toBinary(0)
        );
    }

    @Test
    void testOne() {
        assertEquals(
                "00000000000000000000000000000001",
                BinaryConverter.toBinary(1)
        );
    }

    @Test
    void testMaxInt() {
        assertEquals(
                "01111111111111111111111111111111",
                BinaryConverter.toBinary(Integer.MAX_VALUE)
        );
    }

}
