package AccessmodifiersOperators;
import  java.util.*;

public class VowelOrConsonant {

    public  static  void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

       String  input = scanner.next();

       char ch  = input.charAt(0);


       switch (ch){

           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
               System.out.println("Vowel");
               break;
           default:
               if( ch >= 'a' && ch <= 'z'){

                   System.out.println("Consonent");
               }



       }






    }


}
