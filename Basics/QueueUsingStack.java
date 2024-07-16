import java.util.Stack;

public class QueueUsingStack {
    public Stack<Integer> input;
    public Stack<Integer> output;
    public QueueUsingStack() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        while (!input.isEmpty()){
            output.push(input.peek());
            input.pop();
        }
        input.push(x);
        while (!output.isEmpty()){
            input.push(output.peek());
            output.pop();
        }
    }

    public int pop() {
        if (input.isEmpty()){
            return -1;
        }
        int val = input.peek();
        input.pop();
        return val;
    }

    public int peek() {
        if (input.isEmpty()){
            return -1;
        }
        return input.peek();
    }

    public boolean empty() {
        return input.isEmpty();
    }
}
