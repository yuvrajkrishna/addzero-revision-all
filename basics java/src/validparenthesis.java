
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class validparenthesis {
    public static void main(String[] args){
        String s = "[({})]";
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '('){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    System.out.println("not balanced");
                    return;
                }
                char poppedChar = stack.pop();
                if ((c == ']' && poppedChar != '[') ||
                        (c == '}' && poppedChar != '{') ||
                        c == ')' && poppedChar != '('){
                    System.out.println("not balanced");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("balanced");
        }else {
            System.out.println("not balanced");
        }
    }
}