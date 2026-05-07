import java.util.Scanner;

public class jump2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        int count = 0, far = 0, end = 0;
        for(int i = 0; i < n - 1; i++){
            far = Math.max(far, nums[i] + i);
            if(i == end){
                count++;
                end = far;
            }
        }
        System.out.println(count);
    }
}
