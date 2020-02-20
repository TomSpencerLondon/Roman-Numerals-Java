import java.util.HashMap;

public class RomanNumeralConverter {
    public String convert(int number){
        String result = "";
        for(NumberToNumeral numberToNumeral: NumberToNumeral.values()){
            while(number >= numberToNumeral.number){
                result += NumberToNumeral.translate(numberToNumeral.number);
                number -= numberToNumeral.number;
            }
        }
        return result;
    }

    enum NumberToNumeral {
        ONE_HUNDRED(100, "C"),
        NINETY(90, "XC"),
        TEN(10, "X"),
        FIVE(5, "V"),
        FOUR(4, "IV"),
        ONE(1, "I");

        private final int number;
        private final String numeral;

        NumberToNumeral(int number, String numeral) {
            this.number = number;
            this.numeral = numeral;
        }

        public static String translate(int number){
            for (NumberToNumeral n : values()){
                if(n.number == number){
                    return n.numeral;
                }
            }
            return "";
        }

    }
}
