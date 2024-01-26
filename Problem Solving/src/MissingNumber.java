public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber1(nums));
    }
    public static int missingNumber1(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]){
                return j;
            }
        }
        return arr.length;
    }

    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public int missingNumber2(int[] nums) {
        int sum1=0;
        int sum2=0;
        int n = nums.length;
        for(int i=0; i<=n; i++){
            sum1 += i;
        }
        for (int num : nums) {
            sum2 += num;
        }
        return (sum1-sum2);
    }
}
