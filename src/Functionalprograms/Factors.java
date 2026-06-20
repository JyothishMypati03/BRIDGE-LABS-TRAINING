package Functionalprograms;
import java.util.*;
public class Factors {

    public static  void main (String[] args){

       Scanner scanner =  new Scanner(System.in);

       System.out.println("Enter number :");

       int N = scanner.nextInt();

       for(int i = 2; i*i <= N; i++){

           while(N % i == 0){

               System.out.println(i);

               N = N /i;

           }

       }

        if(N > 1){

            System.out.println(N);
        }

    }

}
