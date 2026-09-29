public class checkifprime {
    static void main() {
        int n = 43;
        if(n == 2){
            System.out.println("Prime");
            return;
        }
        if(n == 0 || n == 1){
            System.out.println("Not prime");
        }
        for(int i = 2 ; i * i <= n ; i++){
            if(n % i == 0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
