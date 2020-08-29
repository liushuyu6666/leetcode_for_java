public class Reverse_Integer_7 {
    public int reverse(int x){
        // 1) need to check when reverse the x to avoid the answer jump beyond the range.
        // 2) when remove symbol of x, pay attention to - 2 ^ 31, who can't be regard as
        //    2 ^ 31 since the upper range is 2 ^ 31 - 1
        if(x == 0) return 0;
        // When x = - 2 ^ 31, we can't assign x = -x; but when we reverse - 2 ^ 31,
        // the answer must beyond the range, so here we return 0 directly if x = - 2 ^ 31
        if(x > Math.pow(2, 31) -1 || x <= - Math.pow(2, 31) ) return 0;
        int symbol = 1;
        if(x < 0){
            symbol = -1;
            x = -1 * x;
        }

        int divide;
        int remain;
        int ans = 0;

        remain = x % 10;
        divide = (int)(x/10);
        while(divide > 0){
            // Check to confirm that ans * 10 + remain is less than 2 ^ 31 - 1 when x > 0,
            // or less than 2 ^ 31 when x < 0;
            // but actually when needn't to check (symbol == -1 && ans == 214748364 && remain == 8)
            // because when this one is satisfied, the input is -8463847421;
            if(ans < 214748364
                    || (ans == 214748364 && remain <= 7) // here 7 could be replaced by 2
                    || (symbol == -1 && ans == 214748364 && remain == 8)){ // the 3rd condition could be removed
                ans = ans * 10;
                ans += remain;
                remain = divide % 10;
                divide = (int)(divide/10);
            }
            else{
                return 0;
            }
        }
        if(ans < 214748364
                || (ans == 214748364 && remain <= 7) // here 7 could be replaced by 2
                || (symbol == -1 && ans == 214748364 && remain == 8)){
            ans = ans * 10;
            ans += remain;
            return ans * symbol;
        }
        else{
            return 0;
        }

    }


    public static void main(String[] args) {
        int a = 123, b = -123, c = 120;
        int d = 1534236469;
        Reverse_Integer_7 ri = new Reverse_Integer_7();
//        System.out.println(ri.reverse(a));
//        System.out.println(ri.reverse(b));
//        System.out.println(ri.reverse(c));
//        System.out.println(ri.reverse(d));
        System.out.println(ri.reverse(-2147483648));
    }
}
