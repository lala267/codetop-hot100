import java.util.Scanner;

public class canJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int far = 0;
        for (int i = 0; i < n; i++) {
            if(far < i) System.out.println(false);
            far = Math.max(far,i+nums[i]);
        }
        System.out.println(true);
    }
}
