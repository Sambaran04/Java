public class SortColors {
    public static void main(String[] args) {
//        Also called as Dutch National Flag Algorithm
//        Approach-1 using sort technique;
//        Approach-2 using Hashmap;
        int[] arr = {2, 2, 0, 0, 1, 0};
        int n=arr.length;
        sort(arr, n);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] arr, int n){
        int low=0, mid=0, high=n-1;
        while(mid<=high){
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++; mid++;
            }
            else if (arr[mid] == 1){
                mid++;
            }
            else if (arr[mid] == 2){
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
