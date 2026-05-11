import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class partition {
    static List<List<String>> res = new ArrayList<>();
    static List<String> path = new ArrayList<>();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        partition(s);
        System.out.print(res);
    }
    private static List<List<String>> partition(String s) {
        backtrack(s, 0);
        return res;
    }
    private static void backtrack(String s, int start) {
        if(start == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < s.length(); i++) {
            if(ishuiwen(s, start, i)){
                path.add(s.substring(start, i + 1));
                backtrack(s, i + 1);
                path.remove(path.size()-1);
            }
        }
    }

    private static boolean ishuiwen(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start++) != s.charAt(end++)) {
                return false;
            }
        }
        return true;
    }
}
