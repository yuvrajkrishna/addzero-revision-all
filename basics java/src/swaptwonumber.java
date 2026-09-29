public class swaptwonumber {
    static void main() {
        int a = 10;
        int b = 20;
        int temp = a ;
        a = a^b;
        b = a^b;
        System.out.println(b);
        a = a^b;
        System.out.println(a);
    }
}
