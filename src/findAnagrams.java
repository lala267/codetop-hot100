import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class findAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length()) System.out.print(res);
        char[] c = p.toCharArray();
        Arrays.sort(c);
        for(int i = 0; i <= s.length() - p.length(); i++){
            String temp = s.substring(i,i+p.length());
            char[] ch = temp.toCharArray();
            Arrays.sort(ch);
            if(Arrays.equals(ch,c)) res.add(i);
        }
        System.out.println(res);
    }
}
