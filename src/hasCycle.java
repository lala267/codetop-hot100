public class hasCycle {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){ this.val = val; }
    }
    public static boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        // 这里才是真正制造环：4重新指向前面的node2
        node4.next = node2;
        System.out.print(hasCycle(head));
    }
}
