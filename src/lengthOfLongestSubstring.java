import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] nums = new char[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.next().charAt(0);
        }
        int ans = 0, left = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            char c = nums[i];
            while(set.contains(c)){
                set.remove(c);
                left++;
            }
            set.add(c);
            ans = Math.max(ans,i - left + 1);
        }
        System.out.println(ans);
    }
}
