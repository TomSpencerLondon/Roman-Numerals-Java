import java.util.HashMap;

public class RomanNumeralConverter {
    String result = "";


    public String convert(int number){
        result = "";
        for(NumberToNumeral numberToNumeral: NumberToNumeral.values()){
            number = resultParser(number, numberToNumeral.number, numberToNumeral.numeral);
        }
        return result;
    }

    private int resultParser(int number, int minimum, String numeral){
        while(number >= minimum){

            result += numeral;
            number -= minimum;
        }
        return number;
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
    }
}
