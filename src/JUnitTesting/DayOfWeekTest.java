package JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DayOfWeekTest {


    @Test
    void test1(){

        assertEquals(6 , DayOfWeek.dayOfWeek(1,1, 2000));

    }

    @Test
    void test2(){

        assertEquals(4 , DayOfWeek.dayOfWeek(1,3, 2002));

    }

    @Test
    void test4(){

        assertEquals(6 , DayOfWeek.dayOfWeek(4,12, 2025));

    }

    @Test
    void test3(){

        assertEquals(2 , DayOfWeek.dayOfWeek(2,8, 2000));

    }

    @Test
    void test5(){

        assertEquals(1 , DayOfWeek.dayOfWeek(9,11, 2000));

    }



}
