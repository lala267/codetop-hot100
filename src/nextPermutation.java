import java.util.Scanner;

public class nextPermutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){i--;}
        if(i >= 0){
            int j = n - 1;
            while(nums[j] <= nums[i]){j--;}
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
        for(int k = 0; k < n; k++){
            if(k > 0) System.out.print(" ");
            System.out.print(nums[k]);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void reverse(int[] nums,int i,int j){
        while(i<j){swap(nums,i++,j--); }
    }
}
