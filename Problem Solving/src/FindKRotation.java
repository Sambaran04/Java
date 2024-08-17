import java.util.*;

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
        if (arr.size()==1) return 0;
        int index=-1;
        int ans = Integer.MAX_VALUE;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr.get(start)<=arr.get(end)){
                if (arr.get(start)<ans){
                    index = start;
                    ans = arr.get(start);
                }
                break;
            }
            if (arr.get(start)<=arr.get(mid)){
                if (arr.get(start)<ans){
                    index = start;
                    ans = arr.get(start);
                }
                start = mid+1;
            }
            else {
                if (arr.get(mid)<ans){
                    index = mid;
                    ans = arr.get(mid);
                }
                end = mid-1;

            }
        }
        return index;
    }
}
