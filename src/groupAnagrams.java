import java.util.*;

public class groupAnagrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for(int i = 0; i < n; i++){
            strs[i] = sc.next();
        }
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c  = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        for(List<String> list : map.values()){
            for(String s : list){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
