import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class solveNQueens {
    static List<List<String>> res = new ArrayList<>();
    static List<String> path = new ArrayList<String>();
    static boolean[] col, diag1, diag2;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        col = new boolean[n];
        diag1 = new boolean[2 * n];
        diag2 = new boolean[2 * n];
        dfs(n, 0);
        for(List<String> board : res){
            for(int i = 0; i < board.size(); i++){
                if(i > 0) System.out.print(" ");
                System.out.print(board.get(i));
            }
            System.out.println();
        }
    }
    public static void dfs(int n, int row) {
        if (row == n) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int c = 0; c < n; c++){
            if(col[c] || diag1[row + c] || diag2[row - c + n]) continue;
            char[] board = new char[n];
            Arrays.fill(board, '.');
            board[c] = 'Q';

            col[c] = true;
            diag1[row + c] = true;
            diag2[row - c + n] = true;

            path.add(new String(board));
            dfs(n, row + 1);

            path.remove(path.size() - 1);
            col[c] = false;
            diag1[row + c] = false;
            diag2[row - c + n] = false;
        }
    }
}
