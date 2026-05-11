import java.util.HashMap;
import java.util.Map;

public class copyRandomList {
    static class Node {
        int val;
        Node next;
        Node random;
        Node(int val) { this.val = val; }
    }
    static Map<Node, Node> map = new HashMap<>();
    public static Node copyRandomList(Node head) {
        if(head == null) return null;
        if(!map.containsKey(head)){
            Node node = new Node(head.val);
            map.put(head, node);
            node.next = copyRandomList(head.next);
            node.random = copyRandomList(head.random);
        }
        return map.get(head);
    }
    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(6);
        Node c = new Node(13);
        a.next  =  b;
        b.next = c;

        a.random = null;
        b.random = a;
        c.random = b;

        Node newHead = copyRandomList(a);
        while (newHead != null){
            int random = newHead.random == null ? -1 : newHead.random.val;
            System.out.println(newHead.val + "" + random);
            newHead = newHead.next;
        }
    }
}
