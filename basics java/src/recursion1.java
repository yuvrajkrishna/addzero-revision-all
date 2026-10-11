public class recursion1 {
    static void printName(int i ,int n){
        if(i > n){
            return;
        }
        System.out.println("Yuvraj");
        printName(i+1,n);
    }
    static void main() {
        int n = 5;
        printName(1,n);
    }
}
