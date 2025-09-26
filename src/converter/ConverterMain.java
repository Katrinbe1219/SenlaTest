package converter;

import java.util.Objects;
import java.util.Scanner;

public class ConverterMain {
    public static void main(String[] args) {
        CurrencyConverter curConverter = new CurrencyConverter();

        int option;
        int option1;

        double firstAmount;
        double result;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter which currency is to be converted options: ");
        System.out.println("0. RUB");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. CNY");
        System.out.println("4. KZT");
        System.out.println("5. TYR");

        option = sc.nextInt();

        System.out.println("Enter amount:");
        firstAmount = sc.nextDouble();

        System.out.println("Enter to which currency convert: ");
        option1 = sc.nextInt();
        String firstOption = curConverter.getOptionByID(option);
        String secOption = curConverter.getOptionByID(option1);

        if (Objects.equals(firstOption, "RUB")){
            result = curConverter.convertFromRubToAny(firstAmount, curConverter.getOptionByID(option1));


        }
        else if (Objects.equals(secOption, "RUB")) {
            result = curConverter.convertFromAnyToRub(firstAmount, curConverter.getOptionByID(option));
        }
        else {
            result = curConverter.convertFromAnyToAny(firstAmount, firstOption, secOption);
        }

        System.out.println("your result is " + result);








    }
}
