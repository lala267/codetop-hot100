import java.util.Scanner;

public class minWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.print(minWindow(s, t));
    }
    public static String minWindow(String s, String t) {
        int[] need = new int[128];
        int count = t.length();
        for(char c : t.toCharArray()){
            need[c]++;
        }
        int left = 0;
        int start = 0;
        int minlen = Integer.MAX_VALUE;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            if(need[c] > 0) count--;
            need[c]--;
            while(count == 0){
                if(right - left < minlen){
                    minlen = right - left + 1;
                    start = left;
                }
                char d = s.charAt(left);
                need[d]++;
                if(need[d] > 0) count++;
                left++;
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}
