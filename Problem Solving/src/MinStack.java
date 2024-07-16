import java.util.Stack;

public class MinStack {
    public Stack<Long> stack = new Stack<>();
    public long min;
    public MinStack() {
        min = Long.MAX_VALUE;
    }

    public void push(int val) {
        long value = (long) val;
        if(stack.isEmpty()){
            min = value;
            stack.push(value);
        }
        else{
            if(value<min){
                stack.push(2*value - min);
                min = value;
            }else{
                stack.push(value);
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        Long val = stack.pop();
        if(val<min){
            min = 2*min-val;
        }
    }

    public int top() {
        Long val = stack.peek();
        if(val<min){
            return (int) min;
        }
        return val.intValue();
    }

    public int getMin() {
        return (int) min;
    }
}
