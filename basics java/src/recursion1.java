public class recursion1 {
    static void printName(int i ,int n){
        if(i < 1){
            return;
        }
        printName(i-1,n);
        System.out.println(i);

    }
    static void main() {
        int n = 5;
        printName(n,n);
    }
}
