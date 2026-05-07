import java.util.*;

public class majorityElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int count = 0;
        int candidate = 0;
        for(int num : nums){
            if(count == 0) candidate = num;
            if(candidate == num) count++;
            else count--;
        }
        System.out.print(candidate);
    }
}
