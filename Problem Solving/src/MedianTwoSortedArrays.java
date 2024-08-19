public class MedianTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
//    Used Binary Search here
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        if(n1>n2) return findMedianSortedArrays(nums2, nums1);
        int left = (n1+n2+1)/2;
        int low=0;
        int high=n1;
        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];
            if(mid1>0) l1=nums1[mid1-1];
            if(mid2>0) l2=nums2[mid2-1];
            if(l1<=r2 && l2<=r1){
                if(n%2==1) return (double) Math.max(l1,l2);
                return ((double) (Math.max(l1,l2) + Math.min(r1,r2)))/2.0;
            }
            else if(l1>r2) high=mid1-1;
            else low=mid1+1;
        }
        return 0;
    }
//    Used Merge sort to merge two arrays, then find the median of them...
    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double[] arr = new double[m+n];
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
        if((m+n)%2 ==0) {
            return (arr[(arr.length / 2) - 1] + arr[(arr.length / 2)]) / 2;
        }
        else return arr[(arr.length / 2)];
    }
}
