import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permute {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, res, path, used);
        return res;
    }

    private static void backtrack(int[] nums, List<List<Integer>> res, List<Integer> path, boolean[] used) {
        if(path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            used[i] = true;
            path.add(nums[i]);
            backtrack(nums, res, path, used);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
}
