import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class letterCombinations {
    static final String[] KEYS = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    static List<String> res = new ArrayList<String>();
    static StringBuilder path = new StringBuilder();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String digits = in.next();
        backtrack(digits, 0);
        for(int i = 0; i < res.size(); i++){
            if(i > 0) System.out.print(" ");
            System.out.print(res.get(i));
        }
    }
    public static void backtrack(String digits, int i){
        if(i == digits.length()){
            res.add(path.toString());
            return;
        }
        String letter = KEYS[digits.charAt(i)-'0'];
        for(char c : letter.toCharArray()){
            path.append(c);
            backtrack(digits, i+1);
            path.deleteCharAt(path.length()-1);
        }
    }
}
