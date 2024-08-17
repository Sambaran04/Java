public class FindNthRootM {
    public static void main(String[] args) {
        System.out.println(NthRoot(9, 1953125));
    }
    public static int NthRoot(int n, int m) {
        int start=1;
        int end = m;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (calculate(mid, n, m)==1){
                return mid;
            }
            else if (calculate(mid, n, m)==0){
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
        // code here
    }
    public static int calculate(int mid, int n, int m){
        long ans=1;
        for (int i = 1; i <= n; i++) {
            ans*=mid;
            if (ans>m) return 2;
        }
        if (ans==m) return 1;
        return 0;
    }
}
