package AccessmodifiersOperators;
import  java.util.*;

public class Reversenumber {

    public  static  void  main(String[] args){

        int n = 1323;


        String N = "";

        while (n >0 ){

            N =N + n % 10;
            n = n /10;


        }

        System.out.println(N);




    }



}
