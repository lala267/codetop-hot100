import java.util.List;

public class mergeTwoLists2 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){ this.val = val;}
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0), cur = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            }else{
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }
        }
        if(list1 == null) cur.next = list2;
        if(list2 == null) cur.next = list1;
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(5);
        ListNode res = mergeTwoLists(list1, list2);

        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
