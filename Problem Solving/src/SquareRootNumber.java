public class SquareRootNumber {
    public static void main(String[] args) {
        System.out.println(floorSqrt(3));
    }
    public static long floorSqrt(long n) {
        long start=1;
        long end = n;
        long ans=0;
        while (start<=end){
            long mid = start+(end-start)/2;
            if (mid*mid==n){
                return mid;
            }
            if (mid*mid<n){
                ans = mid;
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return ans;
        // Your code here
    }
}
