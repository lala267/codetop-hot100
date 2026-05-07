import java.util.Scanner;

public class removeDuplicatestwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 2;
        for (int i = 2; i < n; i++) {
            if (arr[i] != arr[k - 2] ) arr[k++] = arr[i];
        }
        System.out.println(k);
    }
}
