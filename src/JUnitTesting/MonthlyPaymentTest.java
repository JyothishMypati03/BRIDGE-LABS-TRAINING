package JUnitTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonthlyPaymentTest {

    @Test
    void testCase1() {
        double payment =
                MonthlyPayment.monthlyPayment(
                        100000,
                        2,
                        10
                );

        assertEquals(4614.49, payment, 1.0);
    }

    @Test
    void testCase2() {
        double payment =
                MonthlyPayment.monthlyPayment(
                        500000,
                        5,
                        8
                );

        assertEquals(10138.20, payment, 1.0);
    }

    @Test
    void testCase3() {
        double payment =
                MonthlyPayment.monthlyPayment(
                        200000,
                        3,
                        12
                );

        assertEquals(6642.10, payment, 1.0);
    }

    @Test
    void testCase4() {
        double payment =
                MonthlyPayment.monthlyPayment(
                        1000000,
                        10,
                        7
                );

        assertEquals(11610.85, payment, 1.0);
    }

    @Test
    void testCase5() {
        double payment =
                MonthlyPayment.monthlyPayment(
                        250000,
                        1,
                        5
                );

        assertEquals(21407.25, payment, 1.0);
    }

}

