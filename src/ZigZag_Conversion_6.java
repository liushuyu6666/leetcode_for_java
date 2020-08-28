public class ZigZag_Conversion_6 {
    public String convert(String s, int numRows){
//        for numRows = 5
//        row1 0  _  _  _  | 8  _  _  _  | 16 _  _  _
//        row2 1  _  _  7  | 9  _  _  15 | 17 _  _  23
//        row3 2  _  6  _  | 10 _  14 _  | 18 _  22 _
//        row4 3  5  _  _  | 11 13 _  _  | 19 21 _  _
//        row5 4  _  _  _  | 12 _  _  _  | 20 _  _  _
//        seg: seg1[0, 7]  | seg2[8, 15] | seg3[16, 23]
        if(numRows < 2 || s.length() < 2) return s;
        int oneLoop = 2 * numRows - 2; // 8
        int seg = 0, left = 0, right = oneLoop;
        int cross_left, cross_right;
        char left_char, right_char;
        String ans = "";
        for(int row = 1; row <= numRows; row++){ // in row
            if(row == 1){
                cross_left = left;
                while(cross_left < s.length()){
                    ans += s.charAt(cross_left);
                    seg++;
                    cross_left = left + oneLoop * seg;
                }
            }
            else if(row < numRows){
                left++;
                right--;
                cross_left = left;
                cross_right = right;
                seg = 0;
                while(cross_left < s.length() || cross_right < s.length()){
                    ans += s.charAt(cross_left);
                    if(cross_right < s.length()){
                        ans += s.charAt(cross_right);
                    }
                    seg++;
                    cross_left = left + oneLoop * seg;
                    cross_right = right + oneLoop * seg;
                }
            }
            else{
                right--;
                cross_right = right;
                seg = 0;
                while(cross_right < s.length()){
                    ans += s.charAt(cross_right);
                    seg++;
                    cross_right = right + oneLoop * seg;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ZigZag_Conversion_6 test = new ZigZag_Conversion_6();
        String s = "PAYPALISHIRING";
        String ans = test.convert(s, 3);
        System.out.println(ans);
    }
}
