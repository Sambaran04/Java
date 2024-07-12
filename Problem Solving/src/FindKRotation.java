import java.util.ArrayList;
import java.util.List;

public class FindKRotation {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(findKRotation(arr));
    }
    public static int findKRotation(List<Integer> arr) {
        int start = 0;
        int end = arr.size()-1;
        if (arr.size()==1) return arr.get(0);
        else if (arr.get(0)>arr.get(1)) return arr.get(0);
        else if (arr.getLast()>(arr.size()-2)) {
            return arr.getLast();
        }
        else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr.get(mid) > arr.get(mid - 1) && arr.get(mid) > arr.get(mid + 1)) {
                    return mid;
                } else if (arr.get(mid) > arr.get(mid - 1)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
