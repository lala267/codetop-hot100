import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){ this.val = val; }
    }
    public static ListNode sortList(ListNode head) {
        ListNode dummy = new ListNode(0), cur = dummy;
        List<Integer> value = new ArrayList<>();
        while(head != null){
            value.add(head.val);
            head = head.next;
        }
        Collections.sort(value);
        for(int i = 0; i < value.size(); i++){
            cur.next = new ListNode(value.get(i));
            cur = cur.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode res = sortList(head);
        while(res != null){
            System.out.print(res.val);
            if(res.next != null) System.out.print(" ");
            res = res.next;
        }
    }
}
