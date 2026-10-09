import java.util.LinkedList;
import java.util.Stack;

public class q5 {
    public static void main(String[] args) {

        LinkList linkList = new LinkList();

        linkList.insert(1);
        linkList.insert(2);
        linkList.insert(3);
        linkList.insert(4);
        linkList.insert(5);
        linkList.insert(6);

//        linkList.printNtNode(4);
//
//        linkList.delete(5);
//        linkList.display();
//
//        linkList.insert(5);
//
//        linkList.delete(5);
//        linkList.display();

//        linkList.printNtNode(-1);

        linkList.printNthNodeFromTail(1);
//        linkList.display();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkList {

    Node head, tail;

    LinkList() {
        head = tail = null;
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

    public void deletefirst() {

        if (head == null) {
            return;
        }

        else if (head == tail) {

            Node temp = head;

            head = tail = null;

            temp.next = null;
        }

        else {

            Node temp = head;

            head = head.next;

            temp.next = null;
        }
    }

    public void deletelast() {

        if (head == null) {
            return;
        }

        else if (head == tail) {

            Node temp = head;

            head = tail = null;

            temp.next = null;
        }

        else {

            Node temp = head;
            Node prev = head;

            while (temp.next != null) {

                prev = temp;
                temp = temp.next;
            }

            tail = prev;

            tail.next = null;

            temp.next = null;
        }
    }

    public int size() {

        if (head == null) {
            System.out.println("Empty List");
            return 0;
        }

        int count = 0;

        Node temp = head;

        while (temp.next != null) {

            count++;

            temp = temp.next;
        }

        return count + 1;
    }

    public void deletemiddle() {

        int size = size();

        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        else if (size == 1) {

            Node temp = head;

            head = tail = null;

            temp.next = null;
        }

        else {

            int mid = size / 2;

            Node temp = head;
            Node prev = head;

            for (int i = 0; i < mid; i++) {

                prev = temp;
                temp = temp.next;
            }

            if (tail == temp) {

                tail = prev;

                tail.next = null;

                temp.next = null;
            }

            else {

                prev.next = temp.next;

                temp.next = null;
            }
        }
    }

    public void delete(int val) {

        if (head == null) {

            System.out.println("Empty List");

            return;
        }

        // Only one node
        else if (head.data == val && head == tail) {

            Node temp = head;

            head = tail = null;

            temp.next = null;

            return;
        }

        // Delete first node
        else if (head.data == val && head != tail) {

            Node temp = head;

            head = head.next;

            temp.next = null;

            return;
        }

        else {

            Node temp = head;
            Node prev = head;

            while (temp.next != null) {

                if (temp.data == val) {
                    break;
                }

                prev = temp;

                temp = temp.next;
            }

            // Value does not exist
            if (tail.data != val && tail == temp) {

                System.out.println("Not Exists");

                return;
            }

            // Delete last node
            else if (tail == temp) {

                tail = prev;

                tail.next = null;

                temp.next = null;
            }

            // Delete middle node
            else {

                prev.next = temp.next;

                temp.next = null;
            }
        }
    }

    public void printNtNode(int node) {

        if (head == null) {

            System.out.println("Empty List");

            return;
        }

        // Invalid position
        if (node <= 0) {

            System.out.println("Invalid Position");

            return;
        }

        int size = size();

        // Position greater than list size
        if (node > size) {

            System.out.println("Not Exists");

            return;
        }

        int i = 1;

        Node temp = head;

        while (temp != null) {

            if (i == node) {

                System.out.println(temp.data);

                return;
            }

            i++;

            temp = temp.next;
        }
    }

    public void printNthNodeFromTail(int node) {
        if(node <= 0){
            System.out.println("Invalid Position");
            return;
        }
        else if (head == null) {
            System.out.println("Empty List");
            return;
        }
        else{
            Stack<Integer> stack = new Stack<>();
            Node temp = head;
            while (temp != null) {
                stack.push(temp.data);
                temp = temp.next;
            }
            int count = 1;
            while(!stack.isEmpty()){
                if(count == node){
                    System.out.println(stack.pop());
                    return;
                }
                stack.pop();
                count++;
            }

            System.out.println("Not Exists");

        }

    }
}