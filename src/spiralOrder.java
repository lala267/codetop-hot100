import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class spiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> res = new ArrayList<>();
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        while(true){
            for(int i = left; i <= right; i++) res.add(matrix[top][i]);
            if(++top > bottom) break;
            for(int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            if(--right < left) break;
            for(int i = right; i >= left; i--) res.add(matrix[bottom][i]);
            if(--bottom < top) break;
            for(int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            if(++left > right) break;
        }
        System.out.print(res);
    }
}
