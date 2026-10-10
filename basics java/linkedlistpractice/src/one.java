import java.util.LinkedList;

public class one {
    static void main() {
        LinkList list=new LinkList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.delete(30);
        list.print();
    }
}

class LinkList{
    Node head,tail;
    LinkList(){
        head = null ;
        tail = null;
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void print(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public void update(int oldval , int newval){
        if(head == null){
            System.out.println("Empty List");
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                if(temp.data==oldval){
                    temp.data = newval;
                    System.out.println("Updated Value From "+ oldval +" to " + newval);
                    return;
                }
                temp=temp.next;
            }
            if(temp == tail && temp.data != oldval){
                System.out.println("Value Doesn't Exists In List");
            }
        }
    }

    public void find(int data){
        if(head==null){
            System.out.println("Empty List");
        }
        else{
            Node temp = head;
            int node = 1;
            while(temp.next!=null){
                if(temp.data==data){
                    System.out.println(node);
                    return;
                }
                node++;
                temp = temp.next;
            }
            if(temp == tail && temp.data != data){
                System.out.println("Value Doesn't Exists In List");
            }
        }
    }
    public void delete(int data){
        if(head==null){
            System.out.println("Empty List");
        }
        else if(head.data == data){
            if(head == tail){
                head = tail = null;
            }
            else{
                head = head.next;
            }
        }
        else{
            Node temp = head;
            Node prev = head;
            while(temp.next!=null){
                temp=temp.next;
                if(temp.data==data){
                    prev.next = temp.next;
                    return;
                }
                prev = prev.next;
            }
            if(temp == tail && temp.data != data){
                System.out.println("Value Doesn't Exists In List");
            }
            else{
                prev.next = null;
            }
        }
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}