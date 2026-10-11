public class recursion1 {
    static void printName(int n){
        if(n == 0){
            return;
        }
        System.out.println("Yuvraj");
        printName(n-1);
    }
    static void main() {
        int n = 5;
        printName(n);
    }
}
