import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class canFinish {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numCourses = sc.nextInt();
        int m = sc.nextInt();
        int[][] prerequisites = new int[m][2];
        for(int i=0;i<m;i++) {
            prerequisites[i][0] = sc.nextInt();
            prerequisites[i][1] = sc.nextInt();
        }
        boolean ans = canFinish(numCourses, prerequisites);
        System.out.println(ans);
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> nextCourses = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            nextCourses.add(new ArrayList<>());
        }
        for(int[] cp : prerequisites) {
            nextCourses.get(cp[1]).add(cp[0]);
        }
        int[] flags = new int[numCourses];
        for(int i = 0; i < numCourses; i++) {
            if(!dfs(nextCourses, flags, i)){
                return false;
            }
        }
        return true;
    }
    private static boolean dfs(List<List<Integer>> nextCourses, int[] flags, int i) {
        if(flags[i] == 1) return false;
        if(flags[i] == 2) return true;
        flags[i] = 1;
        for(int next : nextCourses.get(i)) {
            if(!dfs(nextCourses, flags, next)) {
                return false;
            }
        }
        flags[i] = 2;
        return true;
    }
}
