import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrayInt[] = new int[20];
        int count=0;
        for (int i = 0; i < arrayInt.length; i++) {
            if(arrayInt[i]==1)count++;
            arrayInt[i] = (int) (Math.random() *6)+1;
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}