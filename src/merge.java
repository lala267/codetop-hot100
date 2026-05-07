import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class merge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for(int i=0;i<n;i++){
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        Arrays.sort(intervals, (a, b)-> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        int[] cur = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            if(cur[1] >= intervals[i][0]){
                cur[1] = Math.max(cur[1], intervals[i][1]);
            }else {
                res.add(cur);
                cur = intervals[i];
            }
        }
        res.add(cur);
        for(int[] arr: res) {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
 }
