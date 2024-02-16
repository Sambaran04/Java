import java.util.LinkedList;

public class LetterCombinationsPhoneNumber {
    public static LinkedList<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
        if (digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            System.out.println("i - ");
            System.out.println(i);
            while (ans.peek().length()==i){
                String t = ans.remove();
                System.out.println("t ");
                System.out.println(t);
                for (char s: mapping[x].toCharArray()){
                    System.out.println("t+s ");
                    System.out.println(t+s);
                    ans.add(t+s);
                }
            }
        }
        return ans;
    }
}
