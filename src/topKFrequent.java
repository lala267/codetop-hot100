import java.util.*;

public class topKFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> minheap = new PriorityQueue<>(
                (a,b)->map.get(a)-map.get(b)
        );
        for(int key : map.keySet()){
            minheap.add(key);
            if(minheap.size()>k) minheap.poll();
        }
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = minheap.poll();
        }
        System.out.println(Arrays.toString(res));
    }
}
