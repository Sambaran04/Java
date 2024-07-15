import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private static Queue<Integer> q1;

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());   // returns 2
        System.out.println(stack.pop());   // returns 2
        System.out.println(stack.empty()); // returns false
    }

    public StackUsingQueue(){
        q1 = new LinkedList<>();
    }
    public static void push(int x){
        q1.add(x);
        for (int i = 0; i < q1.size()-1; i++) {
            q1.add(q1.poll());
        }
    }
    public static int pop() {
        if (!q1.isEmpty()){
            return q1.poll();
        }
        return -1;
    }
    public static int top() {
        if(!q1.isEmpty()){
            return q1.peek();
        }
        return -1;
    }
    public static boolean empty() {
        return q1.isEmpty();
    }
}
