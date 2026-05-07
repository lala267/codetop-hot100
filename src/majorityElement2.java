import java.util.Scanner;

public class majorityElement2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        int count = 0, candidate = 0;
        for(int i=0;i<n;i++){
            if(count == 0) candidate = nums[i];
            if(candidate == nums[i]) count++;
            else count--;
        }
        System.out.println(candidate);
    }
}
