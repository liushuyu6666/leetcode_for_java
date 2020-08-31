import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number_17 {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, String> numberString = new HashMap<>();
        numberString.put(2, "abc");
        numberString.put(3, "def");
        numberString.put(4, "ghi");
        numberString.put(5, "jkl");
        numberString.put(6, "mno");
        numberString.put(7, "pqrs");
        numberString.put(8, "tuv");
        numberString.put(9, "wxyz");
        List<String> res = new ArrayList<>();
        List<String> input = new ArrayList<>();
        Letter_Combinations_of_a_Phone_Number_17 lco
                = new Letter_Combinations_of_a_Phone_Number_17();
        if(digits.length() < 1) return res;
        for(int i = 0; i < digits.length(); i++){
            res = lco.listForm(input, numberString.get(digits.charAt(i) - '0'));
            input = res;
        }
        return res;
    }

    public List<String> listForm(List<String> aircraftCarrier, String plane){
        List<String> res = new ArrayList<>();
        if(aircraftCarrier.size() < 1){
            for(int j = 0; j < plane.length(); j++){
                res.add("" + plane.charAt(j));
            }
        }
        else{
            for(int i = 0; i < aircraftCarrier.size(); i++){
                for(int j = 0; j < plane.length(); j++){
                    res.add(aircraftCarrier.get(i) + plane.charAt(j));
                }
            }
        }
        aircraftCarrier.clear();
        return res;
    }

    public static void main(String[] args) {
        Letter_Combinations_of_a_Phone_Number_17 lcoapn =
                new Letter_Combinations_of_a_Phone_Number_17();
        System.out.println(lcoapn.letterCombinations("23"));
    }
}
