import java.util.Arrays;

public class circularqueuehai {
    static int queue[] = new int [5];
    static int rear = -1 , front = -1;
    static void main() {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        System.out.println(Arrays.toString(queue));
        enqueue(60);
        dequeue();
        enqueue(70);
        System.out.println(Arrays.toString(queue));
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        System.out.println(front);
        System.out.println(rear);
    }
    public static void enqueue(int num) {
        if(rear == queue.length-1 && front == -1) {
            System.out.println("queue is full");
        }
        else if(rear < queue.length-1) {
            rear++;
            queue[rear] = num;
        }
        else if(front > -1 ){
            rear = (rear + 1) % queue.length;
            if(rear < front){
                queue[rear] = num;
            }
            else if(rear == front){
                queue[rear] = num;
                front = -1;
            }
        }
    }
    public static void dequeue() {
        if((rear == front &&  front == -1) || (front == queue.length-2 && rear == queue.length-1)) {
            System.out.println("queue is empty");
        }
        front++;
    }

}
