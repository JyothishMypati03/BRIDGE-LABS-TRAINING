package JAVAFundamental;

public class LineComparisonComputation {

    public static  void main(String[] args){

        int X1 = 2;
        int Y1 = 5;
        int X2 = 3;
        int Y2 = 9;

        double len  = Math.sqrt(
                Math.pow((X2 - X1) , 2) + Math.pow( (Y2 - Y1) , 2)
        );


        System.out.println(len);

    }


}
