import java.util.Scanner;

public class maxProfittwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int[][] f = new int[n + 1][2];
        f[0][1] = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            f[i + 1][0] = Math.max(f[i][0], f[i][1] + nums[i]);
            f[i + 1][1] = Math.max(f[i][1], f[i][0] - nums[i]);
        }
        System.out.println(f[n][0]);
    }
}
