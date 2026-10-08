import java.util.Stack;

public class leetcode1 {
    static void main() {
        String s = "(1+(2*3)+((8)/4))+1";
        Stack<Character> stack = new Stack<>();
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch =  s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if(ch == ')') {
                if((stack.peek() == '(' && ch == ')') || (stack.peek() == '[' && ch == ']') || (stack.peek() == '{' && ch == '}')) {
                    stack.pop();
                }
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                continue;
            }

                if(max < stack.size()) {
                    max = stack.size();
                }

        }
        System.out.println(max);
    }
}
