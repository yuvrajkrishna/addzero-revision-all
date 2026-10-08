import java.util.LinkedList;

public class q5 {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insert(1);
        linkList.insert(2);
        linkList.insert(3);
        linkList.insert(4);
        linkList.insert(5);
        linkList.insert(6);
//        linkList.display();
//        linkList.deletelast();
//        linkList.display();
        System.out.println(linkList.size());
        linkList.deletemiddle();
        linkList.display();
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

class LinkList{
    Node head , tail;

    LinkList(){
        head = tail = null;
    }
    public void insert(int data){
        Node nn = new Node(data);
        if(head == null){
            head = tail = nn;
        }
        else {
            tail.next = nn;
            tail = nn;

        }
    }
    public void display(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        else {
            Node temp = head;
            while(temp.next != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public void deletefirst(){
        if(head == null){
            return;
        }
        else if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
        }
    }

    public void deletelast(){
        if(head == null){
            return;
        }
        else if(head == tail){
            head = tail = null;
        }
        else{
            Node temp = head;
            Node prev = head;
            while(temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            tail = prev;
            tail.next = null;
        }
    }

    public int size(){
        if(head == null){
            System.out.println("Empty List");
            return 0;
        }

        else{
            int count = 0;
            Node temp = head;
            while(temp.next != null){
                count++;
                temp = temp.next;
            }
            return count+1;
        }
    }

    public void deletemiddle(){
        int size = size();
        int mid = size / 2;
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        else if(size == 1){
            head = tail = null;
        }
        else{
            Node temp = head;
            Node prev = head;
            for(int i = 0; i < mid; i++){
                prev = temp;
                temp = temp.next;
            }

            if(tail == temp){
                tail = prev;
                tail.next = null;
            }
            else{
                prev.next = temp.next;

            }
        }

    }
}