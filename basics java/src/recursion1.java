public class recursion1 {
    static int  printName(int n){
        if(n == 0){
            return 0;
        }
        return n+printName(n-1);
    }
    static void main() {
        int n = 5;
        System.out.println(printName(n));
    }
}
