import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int j = target - nums[i];
            if(map.containsKey(j)){
               System.out.print(map.get(j) + " " + i);
               return;
            }
            map.put(nums[i],i);
        }
        System.out.print(" ");
    }
}
