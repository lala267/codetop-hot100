import java.util.PriorityQueue;
import java.util.Scanner;

public class findKthLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num : nums){
            heap.offer(num);
            if(heap.size() > k) heap.poll();
        }
        System.out.println(heap.peek());
    }
}
