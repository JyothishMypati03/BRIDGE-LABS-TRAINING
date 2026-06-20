package JAVAFundamental;
import  java.util.*;

public class CheckEqualityofTwoLines {

    public  static  void main (String[] args){

        int X1 = 2;
        int X2 = 5;
        int Y1 = 3;
        int Y2 = 9;

        Double Line1 = Math.sqrt(
                Math.pow((X2 - X1) ,2) + Math.pow(( Y2 - Y1) , 2)
        );

        Double Line2 = Math.sqrt(

                Math.pow((X2 - X1) ,2) + Math.pow(( Y2 - Y1) , 2)
        );

        if(Line1.equals( Line2)){

            System.out.println("Equal");

        }else {

            System.out.println("Not equal");
        }


    }

}
