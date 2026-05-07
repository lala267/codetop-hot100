import java.util.Scanner;

public class maxProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int max = nums[0], curmax = nums[0], curmin = nums[0];
        for(int i=1;i<n;i++){
            int cur =  nums[i];
            if(cur < 0){
                int temp = curmin;
                curmin = curmax;
                curmax = temp;
            }
            curmax = Math.max(nums[i], nums[i] * curmax);
            curmin = Math.min(nums[i], nums[i] * curmin);
            max = Math.max(max, curmax);
        }
        System.out.println(max);
    }
}
