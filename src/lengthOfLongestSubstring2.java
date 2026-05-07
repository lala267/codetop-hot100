import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lengthOfLongestSubstring2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0, left = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans, right - left + 1);
        }
        System.out.println(ans);
    }
}
