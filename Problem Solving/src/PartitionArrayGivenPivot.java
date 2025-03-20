//https://leetcode.com/problems/partition-array-according-to-given-pivot/description/?envType=daily-question&envId=2025-03-03

public class PartitionArrayGivenPivot {
    public static void main(String[] args) {
        int[] nums = {9, 12, 3, 5, 14, 10, 10};
        int pivot = 10;
        int[] arr = pivotArray(nums, pivot);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                arr[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                arr[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                arr[k] = nums[i];
                k++;
            }
        }
        return arr;
    }
}
