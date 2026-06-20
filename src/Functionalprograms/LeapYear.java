package Functionalprograms;
import java.util.*;

public class LeapYear {


    public static  void main(String[] args){

       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year :");
       int year  = scanner.nextInt();

       if(year < 1000 || year > 9999){

           System.out.println("Enter correct year :");
           return;

       }

       if((year % 400 == 0) || (year % 4 ==0 && year % 100 != 0) ){

           System.out.println("YES this is leap year ");

       }else{

           System.out.println("NO this is not leap year ");

       }

    }

}
