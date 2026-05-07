import java.util.Scanner;

public class largestRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = -1;
        right[n - 1] = n;
        for (int i = 1; i < n; i++) {
            int t = i - 1;
            while(t >= 0 && nums[t] >= nums[i]) {
                t = left[t];
            }
            left[i] = t;
        }
        for (int i = n - 2; i >= 0; i--) {
            int t = i + 1;
            while(t < n && nums[t] >= nums[i]) {
                t = right[t];
            }
            right[i] = t;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int wid = right[i] - left[i] - 1;
            ans = Math.max(ans, wid * nums[i]);
        }
        System.out.println(ans);
    }
}
