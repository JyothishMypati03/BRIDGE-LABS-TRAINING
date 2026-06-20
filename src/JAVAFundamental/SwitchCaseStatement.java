package JAVAFundamental;

import java.util.Random;

public class SwitchCaseStatement {

    public static  void  main (String[] args){

       Random random =  new Random();

       int attendence = random.nextInt(2);

       switch (attendence){

           case 0 : System.out.println("PRESENT"); break;
           case 1 : System.out.println("ABSENT"); break;



       }



    }

}
