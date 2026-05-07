import java.util.Scanner;

public class maxArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int left = 0,  right = n - 1, max = 0;
        for (int i = 0; i < n; i++) {
            int area = Math.min(nums[left],  nums[right]) * (right - left);
            max = Math.max(area, max);
            if(nums[left] <= nums[right]) left++;
            else right--;
        }
        System.out.println(max);
    }
}
