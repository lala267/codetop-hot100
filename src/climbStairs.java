import java.util.Scanner;

public class climbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b = 2, c = 0;
        if(n <= 2) System.out.println(n);
        for(int i = 3; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
