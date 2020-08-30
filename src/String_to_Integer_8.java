public class String_to_Integer_8 {
    public int myAtoi(String str){
        if (str == "") return 0;
        boolean haventMeetDig = true;
        int symbol = 1;
        int INT_MAX = (int)(Math.pow(2, 31) - 1);
        int INT_MIN = (int)(Math.pow(2, 31) * -1);
        long sum = 0;
        for(int i = 0; i < str.length(); i++){

            // meet empty char before meeting validated numbers
            if (str.charAt(i) == ' ' && haventMeetDig) continue;

            // meeting empty char after meeting validated numbers
            else if(str.charAt(i) == ' ' && !haventMeetDig) return (int) sum * symbol;

            // meet the first '+' or '-'
            else if (haventMeetDig && (str.charAt(i) == '+' || str.charAt(i) == '-')){
                haventMeetDig = false;
                if(str.charAt(i) == '-') symbol = -1;
            }

            else if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                haventMeetDig = false;
                sum = sum * 10 + (int)(str.charAt(i) - '0');
                if(sum * symbol > INT_MAX) return INT_MAX;
                if(sum * symbol < INT_MIN) return INT_MIN;
            }

            // good luck
            else {
                return (int)sum * symbol;
            }
        }
        return (int)sum * symbol;
    }

    public static void main(String[] args) {
        String a = " +0 123";
        String_to_Integer_8 sti = new String_to_Integer_8();
        System.out.println(sti.myAtoi(a));
    }
}
