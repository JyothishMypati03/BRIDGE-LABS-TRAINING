package JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VendingMachineTest {

    @BeforeEach
    void resetCount(){
        VendingMachine.count=0;

    }

    @Test
    void testAmount289(){

        assertEquals(9,VendingMachine.calculateNotes(289));

    }


    @Test
    void testAmount15(){

        assertEquals(2,VendingMachine.calculateNotes(15));

    }

    @Test
    void testAmount1000(){

        assertEquals(1,VendingMachine.calculateNotes(100));

    }


}
