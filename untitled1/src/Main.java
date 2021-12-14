import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[20];
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(6);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
        }
        System.out.println(count);

        int[] nums1 = new int[10];
        Random random1 = new Random();
        int count1 = 0;
        double avg = 0;
        for (int i = 0; i < nums1.length; i++) {
        nums1[i] = random.nextInt(100)+1;
        }
        int sum = 0;
        for(int i = 0; i < nums1.length;i++){
            sum += nums1[i];
        }
        avg = (double) sum / nums1.length;
        System.out.println(avg);



    }
    public static void swap (int x, int y, int[]arr) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

