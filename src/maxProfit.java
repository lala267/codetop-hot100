import java.util.Scanner;

public class maxProfit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int minprice = Integer.MAX_VALUE;
        int maxprofit = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            minprice = Math.min(minprice, nums[i]);
            maxprofit = Math.max(maxprofit, nums[i] - minprice);
        }
        System.out.println(maxprofit);
    }

}
