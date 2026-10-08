    import java.util.LinkedList;
    import java.util.Queue;

    public class q2 {
        static void main() {
            int tickets[] = {2,3,2};
            int k = 2;
            Queue<Integer> q = new LinkedList<>();
            for(int i = 0; i < tickets.length; i++) {
                q.offer(tickets[i]);
            }
            int n = tickets.length;
            int c = 0;
            while(!q.isEmpty()) {
                int ticket = q.poll();
                if(k == 0 && ticket == 1){
                    c++;
                    break;
                }
                else if(k==0){
                    q.offer(--ticket);
                    k = n-1;
                    c++;
                    System.out.println(q);
                }
                else{
                    if(ticket == 1){
                        c++;
                        --n;
                        --k;
                        System.out.println(q);
                    }
                    else{
                        q.offer(--ticket);
                        c++;
                        k--;
                        System.out.println(q);
                    }
                }
            }
            System.out.println(c);
        }
    }
