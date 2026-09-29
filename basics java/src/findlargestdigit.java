public class findlargestdigit {
    static void main() {
        int n = 634787;
        int l = 0;
        while (n != 0) {
            if(l < n%10){
                l = n% 10;
            }
            n = n/10;
        }
        System.out.println(l);
    }
}
