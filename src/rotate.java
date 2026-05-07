import java.util.Arrays;
import java.util.Scanner;

public class rotate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k %= n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(nums[i]);
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void reverse(int[] nums, int left, int right){
        while (left < right) swap(nums, left++, right--);
    }
}
