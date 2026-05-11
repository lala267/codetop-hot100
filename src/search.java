import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) nums[i] = sc.nextInt();
        int target = sc.nextInt();
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) {
                System.out.print(mid);
                return;
            }
            //左半边有序
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]) right = mid - 1;
                else  left = mid + 1;
            }else{
                if(nums[mid] < target && target <= nums[right]) left = mid + 1;
                else  right = mid - 1;
            }

        }
        System.out.print(-1);
    }
}
