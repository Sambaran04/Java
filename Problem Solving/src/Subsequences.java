import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        String arr = "cab";
        ArrayList<Character> ans = new ArrayList<>();
        int n=arr.length();
        sequence(0, ans, arr, n);
    }
    public static void sequence(int ind, ArrayList<Character> ans, String arr, int n){
        if (ind==n) {
            for (Character it:ans){
                System.out.print(it+" ");
            }
            if (ans.isEmpty()){
                System.out.print("{}");
            }
            System.out.println();
            return;
        }
        sequence(ind+1, ans, arr, n);

        ans.add(arr.charAt(ind));
        sequence(ind+1, ans, arr, n);
        ans.removeLast();
    }
}
