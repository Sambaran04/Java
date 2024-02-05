import java.util.Arrays;

public class MediunTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
//    Used Merge sort to merge two arrays, then find the median of them...
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while (i<m && j<n){
            if (nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++; i++;
            }
            else{
                arr[k]=nums2[j];
                k++; j++;
            }
        }
        while (i<m){
            arr[k]=nums1[i];
            k++; i++;
        }
        while (j<n){
            arr[k]=nums2[j];
            k++; j++;
        }
        if((m+n)%2 ==0){
            return ((double) arr[(arr.length/2)-1] + (double) arr[(arr.length / 2)]) /2;
        }
        else{
            return (double) arr[(arr.length / 2)];
        }
    }
}
