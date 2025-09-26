package hanged_man;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameLogic {
    private ArrayList<String> guessWords = new ArrayList<String>();
    private String guessWord;

    private int lifes = 6;
    private ArrayList<Boolean> foundChars = new ArrayList<>();

    GameLogic(){
        guessWords.add("senla");
        guessWords.add("test");
        guessWords.add("perfect");
        guessWords.add("work");
        guessWords.add("enrolled");

        randomlyChooseWord();
    }

    int getLifes(){
        return this.lifes ;
    }

    void DecrementLifes(){
        this.lifes--;
    }


    String getWord(){
        return this.guessWord;
    }

    ArrayList<Boolean> getFoundChars(){
        return this.foundChars;
    }

    private void randomlyChooseWord(){
        int randomIndex = getRandomIndex();
        guessWord = guessWords.get(randomIndex);
        createEmptyFoundChars();
    }

    private  int getRandomIndex(){
        Random rn = new Random();
        return rn.nextInt(guessWords.size());
    }

    private void createEmptyFoundChars(){
        int length = guessWord.length();
        for (int i=0; i< length; i++){
            foundChars.add(false);
        }
    }

    boolean checkInput(char input){
        boolean flag = false;

        for  (int i = 0; i < guessWord.length(); i++){
            if (input == guessWord.charAt(i)){
                    flag = true;
                    foundChars.set(i, true);

            }
        }

        return flag;
    }

    boolean checkEquality(){
        for (int i=0; i< foundChars.size(); i++){
            if (!foundChars.get(i)){
                return false;
            }
        }
        return true;
    }





}
