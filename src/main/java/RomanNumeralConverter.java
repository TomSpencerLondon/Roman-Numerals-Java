import java.util.HashMap;

public class RomanNumeralConverter {
    public String convert(int number){
        String result = "";

        if(number >= 100){
            result += "C";
            number -= 100;
        }

        while(number >= 10){
            result += "X";
            number -= 10;
        }
        if(number >= 5){
            result += "V";
            number -= 5;
        }
        if(number == 4){
            result += "IV";
            number -= 4;
        }
        while(number > 0){
            result += "I";
            number -= 1;
        }
        return result;
    }
}
