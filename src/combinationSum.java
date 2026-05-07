import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combinationSum {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candidates = new int[n];
        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        backtrack(candidates, target, 0);
        System.out.println(res);
    }
    public static void backtrack(int[] candidates, int target, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if(target < candidates[i]) continue;
            path.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i);
            path.remove(path.size() - 1);
        }
    }
}
