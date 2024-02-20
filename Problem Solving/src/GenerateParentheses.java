import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n =3;
        System.out.println(generateParenthesis(n));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        findAll("(", 1, 0, ans, n);
        return ans;
    }

    public static void findAll(String current, int open, int close, List<String> ans, int n){
        if (current.length()==2*n){
            ans.add(current);
            return;
        }
        if (open<n) findAll(current+"(", open+1, close, ans, n);
        if (close<open) findAll(current+")", open, close+1, ans, n);
    }
}
