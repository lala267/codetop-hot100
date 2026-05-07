import java.util.*;

public class mergeListedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] a = new int[m];
        int [] b = new int[n];
        for(int i = 0; i < m; i++){a[i] = sc.nextInt();}
        for(int i = 0; i < n; i++){b[i] = sc.nextInt();}

        int i = 0, j = 0, k = 0;
        int [] ans = new int[m + n];
        while (i < m && j < n){
            if(a[i] < b[j]){ ans[k++] = a[i++];}
            else { ans[k++] = b[j++];}
        }
        while(i < m){ans[k++] = a[i++];}
        while(j < n){ans[k++] = b[j++];}
        for(int t = 0; t < m + n; t++){
            if(t > 0) System.out.print(" ");
            System.out.print(ans[t]);
        }
    }

}
