import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generateParenthesis {
    static List<String> res = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dfs(n, res, 0, 0, "");
        System.out.println(res);
    }
    public static void dfs(int n, List<String> res, int left, int right, String path) {
        if(left + right == 2 * n){
            res.add(path);
            return;
        }
        if(left < n){
            dfs(n, res, left + 1, right, path + "(");
        }
        if(right < left){
            dfs(n, res, left, right + 1, path + ")");
        }
    }
}
