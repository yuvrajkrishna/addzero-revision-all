public class recursion1 {
    static int printName(int n,int i,int fact){
        if(i > n){
            return fact;
        }
        return printName(n,i+1,fact*i);
    }
    static void main() {
        int n = 5;
        System.out.println(printName(n,1 , 1));
    }
}
