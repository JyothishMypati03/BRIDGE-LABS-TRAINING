package JAVAFundamental;
import java.util.*;

public class CheckEmployeeisPresent {

    public static  void main (String[] args){

        Random random =  new Random();

        int attendence = random.nextInt(2);

        if(attendence == 1){

            System.out.println("Present");

        }else{

            System.out.println("Absent");

        }


    }

}
