import java.util.Arrays;
import java.util.Scanner;

public class longestConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int max = 1;
        int ans = 1;
        Arrays.sort(nums);
        if(n == 0) System.out.println("0");
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if (i > 0 && nums[i] == nums[i-1] + 1){ans++;}
            else{max = Math.max(max, ans); ans = 1;}
        }
        max = Math.max(max, ans);
        System.out.println(max);
    }
}
