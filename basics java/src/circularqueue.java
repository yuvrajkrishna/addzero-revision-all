import java.util.Arrays;

public class circularqueue {
    static int[] queue=new int[5];
    static  int front=-1;
    static  int rear=-1;

    static void main() {
    push(10);
    push(20);
    push(30);
    push(40);
    push(50);
    pop();
    push(60);
    push(70);

    }
    public static void push(int num) {
        if(rear == queue.length-1 && front == -1) {
            System.out.println("queue is full");
            return;
        }
        if(front == -1) {
            rear++;
            queue[rear]=num;
        }
        else{
            rear = (rear+1)%queue.length;
            queue[rear]=num;
        }
    }
    public static void pop() {
        if(rear == front) {
            System.out.println("queue is empty");
            return;
        }
        front++;
    }
}
