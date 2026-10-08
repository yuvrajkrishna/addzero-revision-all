import java.util.LinkedList;
import java.util.Queue;

public class q4 {

    public static void main(String[] args) {

        RecentCounter obj = new RecentCounter();

        System.out.println(obj.ping(1));
        System.out.println(obj.ping(100));
        System.out.println(obj.ping(3001));
        System.out.println(obj.ping(3002));
    }

    static class RecentCounter {

        Queue<Integer> q = new LinkedList<>();

        public RecentCounter() {

        }

        public int ping(int t) {

            // Current ping ko queue mein add karo
            q.offer(t);

            // 3000 ms se purane pings remove karo
            while(q.peek() < t - 3000) {
                q.poll();
            }

            // Valid pings ki count
            return q.size();
        }
    }
}