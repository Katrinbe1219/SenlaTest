package converter;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    Map<String, Double> currency = new HashMap<String, Double>();

    CurrencyConverter(){
        currency.put("USD", 83.35);
        currency.put("EUR", 99.04);
        currency.put("CNY", 11.71);
        currency.put("KZT", 0.15);
        currency.put("TRY", 2.02);
    }

    double convertFromRubToAny(Double rubAmount, String anyCurrency){
        return rubAmount / currency.get(anyCurrency);
    }

    double convertFromAnyToRub(Double anyAmount, String anyCurrency){
        return anyAmount * currency.get(anyCurrency);
    }

    double convertFromAnyToAny(Double anyAmount1, String anyCurrency1, String anyCurrency2){
        double toRub = anyAmount1 * currency.get(anyCurrency1);
        return toRub / currency.get(anyCurrency2);
    }

    String getOptionByID(int option){
        return switch (option) {
            case 0 -> "RUB";
            case 1 -> "USD";
            case 2 -> "EUR";
            case 3 -> "CNY";
            case 4 -> "KZT";
            case 5 -> "TRY";
            default -> "";
        };
    }
}
