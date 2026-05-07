import java.util.Scanner;

public class searchRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.print(first(nums, target) + " " + last(nums, target));
    }
    public static int first(int[] nums, int target){
        int left = 0, right = nums.length - 1, ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                if(nums[mid] == target) ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
    public static int last(int[] nums, int target){
        int left = 0, right = nums.length - 1, ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target){
                if(nums[mid] == target) ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
