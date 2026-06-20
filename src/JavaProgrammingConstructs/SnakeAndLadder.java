package JavaProgrammingConstructs;

public class SnakeAndLadder {

    public static void main(String[] args) {

        int WinningScore  = 100;

        int diceCount = 0 ;

        int person1 = 0;
        int person2 = 0;

        while( person1 < WinningScore && person2 < WinningScore){

            boolean playAgain;

            do{

                playAgain = false;

                int dice = (int) (Math.random() * 6) +1;
                int option = (int) (Math.random() * 3) ;


                diceCount++;

                switch (option){



                    case 0:

                        System.out.println("Player 0ne is not played ");
                        break;

                    case 1:
                        if(person1+dice <= WinningScore){

                            person1 = person1+dice;


                        }

                        System.out.println("Player 1 : Ladder");
                        playAgain = true;
                        break;


                    case  2 :

                        person1 = person1 - dice;

                        if(person1 < 0){

                            person1 = 0 ;
                        }
                        break;

                }

                System.out.println("Player one position = " + person1);



            }while (playAgain && person1 < WinningScore);

            if(person1 == WinningScore){

                System.out.println("player one is the winner");
                break;

            }


            do{

                playAgain = false;

                int dice = (int) (Math.random() * 6) +1;
                int option = (int) (Math.random() * 3) ;


                diceCount++;

                switch (option){



                    case 0:

                        System.out.println("Player Two is not played ");
                        break;

                    case 1:
                        if(person2 + dice <= WinningScore){

                            person2 = person2+dice;


                        }

                        System.out.println("Player 2 : Ladder");
                        playAgain = true;
                        break;


                    case  2 :

                        person2 = person2 - dice;

                        if(person2 < 0){

                            person2 = 0 ;
                        }
                        break;

                }

                System.out.println("Player two position = " + person2);



            }while (playAgain && person2 < WinningScore);

            if(person2 == WinningScore){

                System.out.println("player Two is the winner");
                break;

            }



        }
        System.out.println("DiceCoiunt = " + diceCount);

























    }


}
