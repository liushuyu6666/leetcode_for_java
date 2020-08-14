import sun.text.normalizer.UCharacter;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public int lengthOfLongestSubstring(String s){
        // single character
        if (s.length() < 2) return s.length();
        // substring length
        int sub_len = 1, max_length = 0;
        for (int i = 0; i < s.length() - 1; i++){
            for (int j = i + 1; j < s.length(); j++){
                if(s.substring(i, j).indexOf(s.charAt(j)) == -1){
                    sub_len ++;
                }
                else {
                    break;
                }
            }
            max_length = Math.max(sub_len, max_length);
            sub_len = 1;
        }
        return max_length;
    }

    // in the optimizer, they record the last(right) index of each character to check
    // if this character is in the window
    public int lengthOfLongestSubstring_optimize(String s){
        if(s.length() < 2) return s.length();
        int max_length = 1;
        Map<Character, Integer> last_character = new HashMap<>();//tips
        // i is the initial point of sliding window
        // j is the end point (exclusive)
        for(int i = 0, j = 0; j < s.length(); j++){
            if(last_character.containsKey(s.charAt(j))){
                // if last_character < i, mean this character is not in the window
                i = Math.max(last_character.get(s.charAt(j)) + 1, i);
            }
            max_length = Math.max(max_length, j - i + 1);
            last_character.put(s.charAt(j), j);// update the last character
        }
        return max_length;
    }

    public static void main(String[] args) {
//        String a = "abcabcbb";
//        String b = "bbbbb";
        String c = "abcbcxyzuijkl";
        Longest_Substring_Without_Repeating_Characters_3 haha = new Longest_Substring_Without_Repeating_Characters_3();
//        int r = haha.lengthOfLongestSubstring_optimize(a);
//        int w = haha.lengthOfLongestSubstring_optimize(b);
        int n = haha.lengthOfLongestSubstring_optimize(c);
//        System.out.println(r);
//        System.out.println(w);
        System.out.println(n);
    }
}
