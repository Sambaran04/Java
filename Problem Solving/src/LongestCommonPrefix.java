import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();

//        Sort the array
        Arrays.sort(strs);

//        Get the first and last word and convert it to a Character Array
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

//        Let's start Comparing...
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) break;
            ans.append(first[i]);
        }
        return ans.toString();
    }
}
