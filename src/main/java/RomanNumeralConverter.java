import java.util.HashMap;

public class RomanNumeralConverter {
    String result = "";


    public String convert(int number){

        number = resultParser(number, 100, "C");
        number = resultParser(number, 90, "XC");
        number = resultParser(number, 10, "X");
        number = resultParser(number, 5, "V");
        number = resultParser(number, 4, "IV");
        number = resultParser(number, 1, "I");

        return result;
    }

    private int resultParser(int number, int minimum, String numeral){
        while(number >= minimum){
            result += numeral;
            number -= minimum;
        }
        return number;
    }
}
