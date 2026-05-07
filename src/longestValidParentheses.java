import java.util.Scanner;

public class longestValidParentheses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int left = 0, right = 0, maxlen = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') left++;
            else right++;
            if(left == right) maxlen = Math.max(left + right, maxlen);
            else if(left < right) left = right = 0;
        }
        left = right = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ')') right++;
            else left++;
            if(left == right) maxlen = Math.max(left + right, maxlen);
            else if(left > right) left = right = 0;
        }
        System.out.print(maxlen);
    }
}
