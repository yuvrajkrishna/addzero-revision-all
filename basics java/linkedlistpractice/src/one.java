public class one {

    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

//        list.print();

        list.cyclecreation();
//        list.cycleCheck();

        list.printElementofCycle();
    }
}

class LinkList {

    Node head, tail;

    LinkList() {
        head = null;
        tail = null;
    }

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Display linked list
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Update a value
    public void update(int oldval, int newval) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == oldval) {
                temp.data = newval;

                System.out.println(
                        "Updated Value From " + oldval + " to " + newval
                );
                return;
            }

            temp = temp.next;
        }

        System.out.println("Value Doesn't Exist In List");
    }

    // Find position of a value (1-based indexing)
    public void find(int data) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Value found at position " + position);
                return;
            }

            position++;
            temp = temp.next;
        }

        System.out.println("Value Doesn't Exist In List");
    }

    // Delete first occurrence of a value
    public void delete(int data) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        // Delete head
        if (head.data == data) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            return;
        }

        Node prev = head;
        Node temp = head.next;

        while (temp != null) {
            if (temp.data == data) {
                prev.next = temp.next;

                // If deleting the last node
                if (temp == tail) {
                    tail = prev;
                }

                return;
            }

            prev = temp;
            temp = temp.next;
        }

        System.out.println("Value Doesn't Exist In List");
    }

    // Create a cycle by connecting tail to the second node
    public void cyclecreation() {
        if (head == null || head.next == null) {
            System.out.println("Cycle Creation Not Possible");
            return;
        }

        tail.next = head.next;

        System.out.println("Cycle Created Successfully");
    }

    // Detect cycle using Floyd's Cycle Detection Algorithm
    public void cycleCheck() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Cycle is Present");
                return;
            }
        }

        System.out.println("Cycle is not Present");
    }

    public void printElementofCycle() {
        if (head == null) {
            System.out.println("Empty List");
        }
        else{
            Node fast = head;
            Node slow = head;
            int s = 0;
            int f = 0;
            int count = 0;
            while(fast!= null && fast.next != null){
                fast = fast.next.next;
                f+=2;
                slow = slow.next;
                s+=1;
                if(s > f){
                    count++;
                }
                if(slow == fast){
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}