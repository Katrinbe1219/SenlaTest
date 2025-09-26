package passwordGenerator;

import java.util.Scanner;

public class Generator {
    public static void main(String[] args) {
        PasswordGenerator pg = new PasswordGenerator();
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the length of future password from 8-12: ");
        int length = sc.nextInt();

        try {
            String newPassword = pg.generatePassword(length);
            System.out.println("The new password is: " + newPassword);
        }catch (OutPasswordLengthRange e){
            System.out.println(e.getMessage());
        }


    }
}
