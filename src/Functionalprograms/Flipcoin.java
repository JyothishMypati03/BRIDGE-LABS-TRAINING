package Functionalprograms;
import  java.util.*;

public class Flipcoin {

    public static void main(String[] args){

          Scanner scan = new Scanner(System.in);

          System.out.println("Enter no of flips : ");

          int noOfFlips = scan.nextInt();

          if(noOfFlips <=0){

              System.out.println("Plz enter positive number");
              return;

          }


          Random random = new Random();

          int heads = 0;
          int tails = 0;

          for(int i=0; i<noOfFlips; i++){

              Double rand = random.nextDouble();

              if(rand < 0.5) {

                  heads++;
              }
              else{

                  tails++;

              }

          }

          Double headPercentage = (heads * 100.0)/noOfFlips;
          Double tailPercentage = (tails * 100.0)/noOfFlips;

          System.out.println(headPercentage);
          System.out.println(tailPercentage);



























    }


}
