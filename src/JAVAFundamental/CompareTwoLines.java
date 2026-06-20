package JAVAFundamental;

public class CompareTwoLines {

    public  static  void  main(String[] args){

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

        int res = Line1.compareTo(Line2);

        if( res == 0){
            System.out.println("Equal");

        } else if ( res > 0) {


            System.out.println("Line1 is greater");

        }else {
            System.out.println("Line2 is greater");

        }


    }


}
