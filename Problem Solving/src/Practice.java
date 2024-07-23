import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if(c=='{'){
                stack.push('}');
            }
            else if (c=='['){
                stack.push(']');
            }else if ((c != stack.pop()) || !stack.isEmpty()){
                return false;
            }
        }
        return true;
    }
}
