package AccessmodifiersOperators;
import  java.util.*;

public class Palingrome {

    public  static  void  main(String[] args){

        int n = 121;
        int o = n;

        int N =0;

        while (n > 0){

            N = (N * 10) + n%10;
            n = n/10;

        }

        if (o == N) {

            System.out.println("YES");

        }



    }


}
