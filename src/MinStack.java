import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> minStack = new ArrayDeque<>();
    public void push(int val){
        stack.push(val);
        if(minStack.isEmpty() || val < minStack.peek()) {
            minStack.push(val);
        }
    }
    public void pop(){
        int val = stack.pop();
        if(val == minStack.peek()){
            minStack.pop();
        }
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }
}
