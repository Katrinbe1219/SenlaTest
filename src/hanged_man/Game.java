package hanged_man;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Game {
    public static void main (String[] args) {
        GameLogic  gameLogic = new  GameLogic();
        int lifes = gameLogic.getLifes();
        boolean isWinner = false;

        GameInterface gameInterface = new GameInterface();


        Scanner sc = new Scanner(System.in);
        char[] symbol;
        boolean checkingInput;

        System.out.println("Game: Hanged Man");

        while(!isWinner){

            System.out.println("Input any symbol which you think included in mystery word");
            symbol  = sc.next().toCharArray();

            if (symbol.length >1){
                if (new String(symbol).equals(gameLogic.getWord())){
                    isWinner = true;
                    break;
                }

                gameLogic.DecrementLifes();
                lifes --;
                gameInterface.showFailure(lifes);
                gameInterface.showStage(lifes);
                if (lifes ==0 ){
                    break;
                }
                continue;
            }
            checkingInput = gameLogic.checkInput(symbol[0]);

            if  (!checkingInput){

                gameLogic.DecrementLifes();
                lifes --;
                gameInterface.showFailure(lifes);
                gameInterface.showStage(lifes);

                if (lifes ==0 ){
                    break;
                }
                continue;
            }

            gameInterface.showEncouragement(lifes,gameLogic.getFoundChars(), gameLogic.getWord());
            isWinner = gameLogic.checkEquality();
        }

        gameInterface.showIsWinner(isWinner, gameLogic.getWord());

    }


}
