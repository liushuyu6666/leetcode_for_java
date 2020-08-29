public class Reverse_Integer_7 {
    public int reverse(int x){
        if(x == 0) return 0;
        int symbol = 1;
        if(x < 0){
            symbol = -1;
            x = -x;
        }

        int divide;
        int remain;
        int ans = 0;

        remain = x % 10;
        divide = (int)(x/10);
        while(divide > 0){
            ans = ans * 10;
            ans += remain;
            remain = divide % 10;
            divide = (int)(divide/10);
        }
        ans = ans * 10;
        ans += remain;
        return ans * symbol;
    }


    public static void main(String[] args) {
        int a = 123, b = -123, c = 120;
        Reverse_Integer_7 ri = new Reverse_Integer_7();
        System.out.println(ri.reverse(a));
        System.out.println(ri.reverse(b));
        System.out.println(ri.reverse(c));
    }
}
