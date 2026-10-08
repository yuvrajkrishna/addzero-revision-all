import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class q1 {
    public static void main(String[] args) {

        String s = "loveleetcode";

        Queue<Character> queue = new LinkedList<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(queue.contains(ch)) {
                queue.remove(ch);
            }
            else {
                queue.add(ch);
            }
        }

        System.out.println(queue);

        if(queue.isEmpty()) {
            System.out.println(-1);
        }
        else {
            char find = queue.peek();

            for(int i = 0; i < s.length(); i++) {

                if(s.charAt(i) == find) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

