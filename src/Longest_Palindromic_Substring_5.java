public class Longest_Palindromic_Substring_5 {
    public String longestPalindrome(String s) {
        // here are two kind of Palindrome:
        //   1) even Palindrome: 'abba', whose length is even;
        //   2) odd Palindrome: 'aba', whose length is odd;
        if(s.length()<1) return "";
        if(s.length()<2) return s;
        int c; // as center character
        int[] maxWing = {0, 0}; // the final range bin
        int palindromeLength = 0, length;
        int[] evenWing; int[] oddWing;
        for(c = 0; c < s.length(); c++){
            evenWing = moveRange(c, c+1, s);
            oddWing = moveRange(c, c, s);
            length = Math.max(evenWing[1] - evenWing[0] + 1, oddWing[1] - oddWing[0] + 1);
            if(palindromeLength < length){
                palindromeLength = length;
                if(length % 2 == 0){
                    maxWing = evenWing;
                }
                else maxWing = oddWing;
            }
        }
        return s.substring(maxWing[0], maxWing[1] + 1);
    }

    private int[] moveRange(int l, int r, String s){
        int left = l; int right = r;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return new int[]{left + 1, right - 1};
    }

    public static void main(String[] args) {
        String a = "babad";
        String b = "cbbd";
        Longest_Palindromic_Substring_5 lswrc = new Longest_Palindromic_Substring_5();
        String result = lswrc.longestPalindrome(b);
        System.out.println(result);
    }
}
