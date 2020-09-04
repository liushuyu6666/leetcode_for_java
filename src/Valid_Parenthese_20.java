import java.util.Stack;

public class Valid_Parenthese_20 {
    public boolean isValid(String s){
        /**tips1: data structure, stack;*/
        Stack par = new Stack();

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                par.push(s.charAt(i));
            }

            if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                if(par.empty()){
                    return false;
                }
                if(s.charAt(i) == ')'){
                    /** tips2: how to convert object to string and char*/
                    if(par.pop().toString().toCharArray()[0] != '('){
                        return false;
                    }
                }
                else if(s.charAt(i) == ']'){
                    if(par.pop().toString().toCharArray()[0] != '['){
                        return false;
                    }
                }
                else if(s.charAt(i) == '}'){
                    if(par.pop().toString().toCharArray()[0] != '{'){
                        return false;
                    }
                }
            }
        }
        if(!par.empty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Valid_Parenthese_20 vp = new Valid_Parenthese_20();
        boolean res = vp.isValid("()[]{}");
        System.out.println(res);
    }
}
