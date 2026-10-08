import java.util.Stack;

public class leetcode2 {

    public static void main(String[] args) {

        String s = "()()";

        Stack<Character> stack = new Stack<>();
        String sb = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {

                if (!stack.isEmpty()) {
                    sb += c;
                }

                stack.push(c);
            }

            else if (c == ')') {

                stack.pop();

                if (!stack.isEmpty()) {
                    sb += c;
                }
            }
        }

        System.out.println(sb);
    }
}