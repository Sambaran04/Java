import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ans.add(generateRow(i));
        }
        return ans;
    }

    public static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        for (int j = 1; j < row; j++) {
            ans = ans * (row - j);
            ans = ans / j;
            temp.add((int) ans);
        }
        return temp;
    }
}
