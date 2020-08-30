public class Roman_to_Integer_13 {
    public int romanToInt(String s){
        if (s == "") return 0;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                sum += 1;
            }
            // IV
            else if(s.charAt(i) == 'V' && i > 0 && s.charAt(i-1) == 'I'){
                sum += 3;
            }
            // V
            else if(s.charAt(i) == 'V'){
                sum += 5;
            }
            // IX
            else if(s.charAt(i) == 'X' && i > 0 && s.charAt(i-1) == 'I'){
                sum += 8;
            }
            // X
            else if(s.charAt(i) == 'X'){
                sum += 10;
            }
            // XL
            else if(s.charAt(i) == 'L' && i > 0 && s.charAt(i-1) == 'X'){
                sum += 30;
            }
            // L
            else if(s.charAt(i) == 'L'){
                sum += 50;
            }
            // XC
            else if(s.charAt(i) == 'C' && i > 0 && s.charAt(i-1) == 'X'){
                sum += 80;
            }
            // C
            else if(s.charAt(i) == 'C'){
                sum += 100;
            }
            // CD
            else if(s.charAt(i) == 'D' && i > 0 && s.charAt(i-1) == 'C'){
                sum += 300;
            }
            // D
            else if(s.charAt(i) == 'D'){
                sum += 500;
            }
            // CM
            else if(s.charAt(i) == 'M' && i > 0 && s.charAt(i-1) == 'C'){
                sum += 800;
            }
            // M
            else if(s.charAt(i) == 'M'){
                sum += 1000;
            }
            else;

        }
        return sum;
    }

    public static void main(String[] args) {
        Roman_to_Integer_13 rti = new Roman_to_Integer_13();
        System.out.println(rti.romanToInt("MCMXCIV"));
    }
}
