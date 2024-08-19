public class FindPeakElement1 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(peak2(arr));
    }
    public static int peak(int[] arr){
        int n = arr.length-1;
        if(n==1) return 0;
        else if(arr[0]>arr[1]) return 0;
        else if (arr[n-1]>arr[n-2]) return n-1;
        else {
            int start = 0;
            int end = n-1;
            while (start<end){
                int mid = start+(end-start)/2;
                if (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
                else if(arr[mid]>arr[mid-1]){
                    start = mid+1;
                }else end=mid-1;
            }
            return -1;
        }
    }
    public static int peak2(int[] arr){
        int start =0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start+ (end-start) / 2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
