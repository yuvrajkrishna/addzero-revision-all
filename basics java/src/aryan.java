public class aryan {

    public static void main() {
        Linkedlist a=new Linkedlist();
        a.insert(4543);
        a.insert(454);
        a.insert(45454655);
        a.display();


    }
}

class Linkedlist{
    NodeLs head,tail;

    public void insert(int data){
        NodeLs nn=new NodeLs(data);
        if(head==null){
            head=tail=nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
    }

    public void display(){
        NodeLs temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void delete(int data){
        NodeLs temp=head;
        NodeLs previus=null;
        boolean flag=false;
        while (temp!=null){
            if(temp.data==data){
                flag=true;
                

            }
        }
    }
}
class NodeLs{
    int data;
    NodeLs next;

    NodeLs(int data){
        this.data=data;
    }
}
