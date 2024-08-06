import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length; // size of the array
        //sort the given intervals:
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int[] interval : intervals) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || interval[0] > ans.getLast().get(1)) {
                ans.add(Arrays.asList(interval[0], interval[1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.getLast().set(1, Math.max(ans.getLast().get(1), interval[1]));
            }
        }
        int[][] val = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < 2; j++) {
                val[i][j] = ans.get(i).get(j);
            }
        }

        return val;
    }
}
