import sun.nio.cs.ext.MacHebrew;

public class Longest_Common_Prefix_14 {
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";
        if(strs.length < 2) return strs[0];
        String PreviousString = strs[0];
        String commonString = strs[0];

        for(int strIndex = 1; strIndex < strs.length; strIndex++){
            PreviousString = commonString;
            commonString = "";
            for(int i = 0; i < Math.min(PreviousString.length(), strs[strIndex].length()); i++){
                if(PreviousString.charAt(i) == strs[strIndex].charAt(i)){
                    commonString += PreviousString.charAt(i);
                }
                else break;
            }
        }
        return commonString;
    }

    public static void main(String[] args) {

        Longest_Common_Prefix_14 lcp =
                new Longest_Common_Prefix_14();
        System.out
                .println(lcp.longestCommonPrefix(new String[] {"aaa", "aa", "aaa"}));
    }
}
