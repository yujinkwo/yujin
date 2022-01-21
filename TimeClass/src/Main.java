public class Main {
    public static void main(String[] args) {
        Time time = new Time(12, 15, 2);
        for(int i = 0 ; i < 100000;i++) {
            time = time.nextSecond();
            System.out.println(time);
        }
    }
}
