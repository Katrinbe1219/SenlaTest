package passwordGenerator;

import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {
    String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*()_+-=[]|,./?><0123456789";
    private final int MINIMAL_LENGTH = 8;
    private final int MAX_LENGTH = 12;

    String generatePassword(int length) throws OutPasswordLengthRange{

        if (length < MINIMAL_LENGTH){
            throw new OutPasswordLengthRange("%s is too short".formatted(length));
        }

        if (length > MAX_LENGTH){
            throw new OutPasswordLengthRange("%s is too long".formatted(length));
        }

        Random rand = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i=0; i<length; i++){
            password.append(symbols.charAt(rand.nextInt(symbols.length())));
        }

        return password.toString();
    }
}
