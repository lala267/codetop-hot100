import java.util.Scanner;

public class numIslands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        System.out.println(count);

    }
    public static void dfs(int[][] grid, int x, int y){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) return;
        if(grid[x][y] == 0) return;
        grid[x][y] = 0;
        dfs(grid, x, y-1);
        dfs(grid, x, y+1);
        dfs(grid, x-1, y);
        dfs(grid, x+1, y);
    }
}
