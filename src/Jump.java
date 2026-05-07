import java.util.Scanner;

public class Jump {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int count = 0, end = 0, far = 0;
        for(int i = 0; i < n - 1; i++){
            far = Math.max(far, i + nums[i]);
            if(i == end){
                count++;
                end = far;
            }
        }
        System.out.println(count);
    }
}
