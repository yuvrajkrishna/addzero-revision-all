import java.util.Stack;

public class infixtopostfix {

    static int precedence(char ch) {
        if (ch == '^') {
            return 3;
        }
        if (ch == '*' || ch == '/') {
            return 2;
        }
        if (ch == '+' || ch == '-') {
            return 1;
        }

        return -1;
    }

    static void main() {

        String str = "a+b*(c^d-e)";

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Operand
            if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch <= '9')) {

                sb.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {

                stack.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            // Operator
            else {

                while (!stack.isEmpty() &&
                        stack.peek() != '(' &&
                        precedence(stack.peek()) >= precedence(ch)) {

                    sb.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        // Empty the remaining stack
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}