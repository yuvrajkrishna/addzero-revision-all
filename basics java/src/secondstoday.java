public class secondstoday {
    static void main() {
        int seconds = 419999;
        int days = seconds / 86400 ;
        seconds %= 86400;
        System.out.println(days);
        int hours = seconds / 3600;
        System.out.println(hours);
        seconds = seconds % 3600;
        int minutes = seconds / 60;
        seconds = seconds % 60;
        System.out.println(minutes);
    }
}
