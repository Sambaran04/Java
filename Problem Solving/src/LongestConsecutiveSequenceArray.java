import java.util.HashSet;

public class LongestConsecutiveSequenceArray {
    public static int longestSuccessiveElements(int[] a) {
        if (a.length==0) return 0;
        int longest=1;
        HashSet<Integer> set = new HashSet<>();
        for (int j : a) {
            set.add(j);
        }
        for (int it:set){
            if (!set.contains(it-1)){
                int count=1;
                int x = it;
                while (set.contains(x+1)){
                    count++;
                    x++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
