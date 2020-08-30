public class Integer_to_Roman_12 {
    public String intToRoman(int num){
        int div = 0, rem = num;
        String res = "";
        for(int i = 3; i >= 0; i--){
            div = (int)(rem / Math.pow(10, i));
            rem = (int)(rem % Math.pow(10, i));
            // 1000
            if(i == 3){
                while(div > 0){
                    res = res + "M";
                    div--;
                }
            }
            // 100
            else if(i == 2){
                if(div == 9){
                    res = res + "CM";
                }
                else if(div > 5){
                    res = res + "D";
                    while(div - 5 > 0){
                        res = res + "C";
                        div --;
                    }
                }
                else if(div == 5){
                    res = res + "D";
                }
                else if(div == 4){
                    res = res + "CD";
                }
                else{
                    while(div > 0){
                        res = res + "C";
                        div --;
                    }
                }
            }
            // 10
            else if(i == 1){
                if(div == 9){
                    res = res + "XC";
                }
                else if(div > 5){
                    res = res + "L";
                    while(div - 5 > 0){
                        res = res + "X";
                        div --;
                    }
                }
                else if(div == 5){
                    res = res + "L";
                }
                else if(div == 4){
                    res = res + "XL";
                }
                else{
                    while(div > 0){
                        res = res + "X";
                        div --;
                    }
                }
            }
            // 1
            else{
                if(div == 9){
                    res = res + "IX";
                }
                else if(div > 5){
                    res = res + "V";
                    while(div - 5 > 0){
                        res = res + "I";
                        div --;
                    }
                }
                else if(div == 5){
                    res = res + "V";
                }
                else if(div == 4){
                    res = res + "IV";
                }
                else{
                    while(div > 0){
                        res = res + "I";
                        div --;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Integer_to_Roman_12 itr = new Integer_to_Roman_12();
        System.out.println(itr.intToRoman(600));
    }
}

