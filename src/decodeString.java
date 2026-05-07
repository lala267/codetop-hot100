import java.util.Scanner;

public class decodeString {

    static int i = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.print(decode(s));
    }

    public static String decode(String s) {
        int num = 0;
        StringBuilder res = new StringBuilder();

        while (i < s.length()) {
            char c = s.charAt(i++);

            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                String sub = decode(s);
                res.append(sub.repeat(num));
                num = 0;
            } else if (c == ']') {
                break;
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }
}