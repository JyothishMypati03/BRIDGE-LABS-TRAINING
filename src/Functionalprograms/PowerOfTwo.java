package Functionalprograms;
import java.util.*;

public class PowerOfTwo {

    public static  void main(String[] args){

        Scanner scanner  = new Scanner(System.in);

        int N = scanner.nextInt();

        if( N < 0 || N > 30){

            System.out.println("Enter number betweeen 1 to 30 :");
            return;

        }

        for(int i=0; i<=N; i++){

            System.out.println("2^" + i + " = " +  (1 << i));

        }


    }

}
