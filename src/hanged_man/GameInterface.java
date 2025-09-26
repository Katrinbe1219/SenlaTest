package hanged_man;

import java.util.ArrayList;

public class GameInterface {

    private ArrayList<String> stages = new ArrayList<String>();

    GameInterface(){
        stages.add("""
                    +---+
                      |   |
                      O   |
                     /|\\  |
                     / \\  |
                          |
                    =========
                """);
        stages.add("""
                +---+
                  |   |
                  O   |
                 /|\\  |
                 /    |
                      |
                =========
                """);
        stages.add("""
                +---+
                  |   |
                  O   |
                 /|\\  |
                      |
                      |
                =========
                """);

        stages.add("""
                +---+
                  |   |
                  O   |
                 /|   |
                      |
                      |
                =========
                
                """);

        stages.add("""
                +---+
                  |   |
                  O   |
                  |   |
                      |
                      |
                =========
                """);

        stages.add("""
                 +---+
                  |   |
                  O   |
                      |
                      |
                      |
                =========
                """);

        stages.add("""
                +---+
                  |   |
                      |
                      |
                      |
                      |
                =========
                """);
    }

    void getMysteryWord(ArrayList<Boolean> foundChars, String word){

        for (int i=0; i< foundChars.size(); i++){
            if (foundChars.get(i)) System.out.print(word.charAt(i));
            else System.out.print("_");
        }

        System.out.println("\n");

    }

    void showEncouragement(int lifes,ArrayList<Boolean> foundChars, String word){
        System.out.println("WELL DONE!");
        System.out.println("Current state of the game:");
        System.out.print("The mystery word: ");
        System.out.printf("Lifes: %s ", lifes);
        getMysteryWord(foundChars, word);
    }

    void showFailure (int lifes){
        System.out.println("Oops. It is not right\n");
        System.out.printf("You have %s attempts\n%n", lifes);
    }

    void showIsWinner(Boolean isWinner, String word){
        if (isWinner){
            System.out.println("Congratulations!");

        } else{
            System.out.println("Sorry, you lost!");
        }
        System.out.printf("The mystery word was %s", word);
    }

    void showStage(int lifes){
        System.out.println(stages.get(6 - lifes));
    }




}
