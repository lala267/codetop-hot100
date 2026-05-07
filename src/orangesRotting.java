import java.util.Scanner;

public class orangesRotting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println(orangesRotting(grid));

    }
    public static int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length, minutes = 0;
        while(true){
            boolean haschange = false;
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(grid[i][j] == 2){
                        if(i > 0 && grid[i - 1][j] == 1){
                            grid[i - 1][j] = 3;
                            haschange = true;
                        }
                        if(i < m - 1 && grid[i + 1][j] == 1){
                            grid[i + 1][j] = 3;
                            haschange = true;
                        }
                        if(j > 0 && grid[i][j - 1] == 1){
                            grid[i][j - 1] = 3;
                            haschange = true;
                        }
                        if(j < n - 1 && grid[i][j + 1] == 1){
                            grid[i][j + 1] = 3;
                            haschange = true;
                        }
                    }
                }
            }
            if(!haschange) break;
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(grid[i][j] == 3) grid[i][j] = 2;
                }
            }
            minutes++;
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1) return -1;
            }
        }
        return minutes;
    }
}