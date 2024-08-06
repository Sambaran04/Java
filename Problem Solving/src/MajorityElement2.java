import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count1=0, count2=0;
        int element1=Integer.MIN_VALUE, element2=Integer.MIN_VALUE;
        for (int num : nums) {
            if (count1 == 0 && num != element2) {
                count1++;
                element1 = num;
            } else if (count2 == 0 && num != element1) {
                count2++;
                element2 = num;
            } else if (element1 == num) {
                count1++;
            } else if (element2 == num) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1=0;count2=0;
        for (int num : nums) {
            if (element1 == num) {
                count1++;
            } else if (element2 == num) {
                count2++;
            }
        }
        int max = (int) (nums.length/3) +1;
        if (count1 >=max){
            ans.add(element1);
        }
        if (count2 >=max){
            ans.add(element2);
        }
        return ans;
    }
}
