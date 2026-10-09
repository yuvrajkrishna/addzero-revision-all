

public class q6 {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        Node random ;
        Node temp = list.head;
        for(int i=0;i<3;i++) {
            if( i==1){
                random = temp;
                break;
            }
            temp = temp.next;
        }
        System.out.println(temp.data);
        list.display();
        list.deleteRandom(temp);
        list.display();
    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static class Linkedlist{
        Node head;
        Node tail;
        Linkedlist(){
            head = null;
            tail = null;
        }
        public void insert(int data) {

            Node nn = new Node(data);

            if (head == null) {
                head = tail = nn;
            }
            else {
                tail.next = nn;
                tail = nn;
            }
        }

        public void display() {

            if (head == null) {
                System.out.println("Empty List");
                return;
            }

            Node temp = head;

            while (temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

            System.out.println(temp.data);
        }

        public void deleteRandom(Node temp){
            Node after = temp.next;
            while (after.next != null){
                temp.data = after.data;
                temp = after;
                after = after.next;
            }
            temp.data = after.data;
            temp.next = null;
        }
    }

}
