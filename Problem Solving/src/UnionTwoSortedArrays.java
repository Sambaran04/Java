import java.util.ArrayList;

public class UnionTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i=0, j = 0, k=0;
        while(i<n && j<m) {
            if (arr1[i] <= arr2[j]) {
                ans.add(k, arr1[i]);
                i++;
                k++;
            } else {
                ans.add(k, arr2[j]);
                k++;
                j++;
            }
        }
        while(i<n){
            ans.add(k, arr1[i]);
            i++;
            k++;
        }
        while(j<m){
            ans.add(k, arr2[j]);
            j++;
            k++;
        }
        return ans;
    }
}
