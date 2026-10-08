import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class q3 {

    public static void main(String[] args) {

        int students[] = {1, 1, 1, 0, 0, 1};
        int sandwiches[] = {1, 0, 0, 0, 1, 1};

        Queue<Integer> q1 = new LinkedList<>();
        Stack<Integer> s1 = new Stack<>();

        for(int i = 0; i < students.length; i++) {
            q1.offer(students[i]);
        }

        for(int i = sandwiches.length - 1; i >= 0; i--) {
            s1.push(sandwiches[i]);
        }

        int count = 0;

        while(!q1.isEmpty() && !s1.isEmpty()) {

            int student = q1.poll();

            if(student == s1.peek()) {

                s1.pop();

                // Successful student mila,
                // so consecutive failure count reset
                count = 0;
            }

            else {

                q1.offer(student);

                count++;

                // Queue ke saare students current sandwich reject kar rahe hain
                if(count == q1.size()) {
                    break;
                }
            }
        }

        System.out.println(q1.size());
    }
}