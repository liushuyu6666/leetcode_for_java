public class Palindrome_Number_9 {
    public boolean isPalindrome(int x){
        if(x < 0) return false;
        else if (x == 0) return true;
        else if (x > 2147447412) return false;
        else{
            String num = Integer.toString(x);
            int left = 0, right = num.length() - 1;
            while(left < right){

                if(num.charAt(left) != num.charAt(right)) return false;
                left ++;
                right --;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Palindrome_Number_9 pn = new Palindrome_Number_9();
        int a = 10;
        System.out.println(pn.isPalindrome(a));
    }
}
