package JavaProgrammingConstructs;
import java.util.*;

public class AttendanceCheck {

    public static void main(String[] args) {

        int ISPRESENT = 1;

        Random random = new Random();

        int empCheck = random.nextInt(2); // Generates 0 or 1

        if (empCheck == ISPRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

}
