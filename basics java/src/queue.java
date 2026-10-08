


public class queue {
    static int[] queue = new int[5];
    static int front=-1, rear=-1;
    public static void main(String[] args){

        enqueue(10);
        enqueue(20);
        enqueue(30);
        deque();
        deque();
        deque();
        enqueue(40);
        enqueue(50);
        enqueue(60);

    }

    private static void deque(){

        if (front == rear){
            System.out.println("Already empty");

        }
        front++;
        System.out.println(queue[front] + " is deleted");
        if (front == rear){
            front=-1;
            rear=-1;
        }
    }
    private static  void enqueue(int value){
        if (queue.length-1 == rear){
            System.out.println("Queue is full");
        }
        rear++;
        queue[rear] = value;
    }
}