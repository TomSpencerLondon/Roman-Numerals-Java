import java.util.HashMap;

public class RomanNumeralConverter {
    HashMap<Integer, String> values;

    RomanNumeralConverter(){
        this.values = new HashMap<Integer, String>();
    }

    public String convert(int number){
        String result = "";

        for (int i = 0; i < number; i++){
            if (number < 4){
                result += "I";
            }
            if (number == 4){
                result = "IV";
            }
            if (number == 5){
                result = "V";
            }
            if (number == 6){
                result = "VI";
            }
        }

        return result;
    }
}
