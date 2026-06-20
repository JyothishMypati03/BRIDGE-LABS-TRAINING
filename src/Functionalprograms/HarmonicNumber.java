package Functionalprograms;
import java.util.*;

public class HarmonicNumber {

        public  static  void main(String[] args){

           Scanner scanner =  new Scanner(System.in);

            int N = scanner.nextInt();

            if( N <= 0){

                System.out.println("Enter valid number ");
                return;

            }

            Double h = 0.0;

            for(int i=1; i<=N; i++){

                h = h + (1.0/i);

            }

            System.out.println("The value of "+ N + "is " + h);

        }
}
