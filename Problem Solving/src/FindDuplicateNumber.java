public class FindDuplicateNumber {
    // USED CYCLIC SORT
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr){
        int i=0;
        while (i< arr.length){
            if(arr[i] != i+1){
                int correct = arr[i]-1;
                if (arr[correct] != arr[i]){
                    swap(arr, correct, i);
                }else return arr[i];
            }
            else{
                i++;
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
