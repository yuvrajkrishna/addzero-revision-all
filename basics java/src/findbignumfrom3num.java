public class findbignumfrom3num {
    static void main() {

        int a = 34;
        int b = 200;
        int c = 200;

        if (a > b && a > c) {
            System.out.println("a is big");
        }
        else if (a < b && b > c) {
            System.out.println("b is big");
        }
        else if (a > b && a < c) {
            System.out.println("c is big");
        }
        else if (a < b && b < c) {
            System.out.println("c is big");
        }
        else if (a == b && a < c) {
            System.out.println("c is big");
        }
        else if (a < b && b == c) {
            System.out.println("b and c are big");
        }
        else if (a > b && a == c) {
            System.out.println("a and c are big");
        }
        else if (a == b && a > c) {
            System.out.println("a and b are big");
        }
        else if (a == c && a < b) {
            System.out.println("b is big");
        }
        else {
            System.out.println("a, b, c are equal");
        }
    }
}