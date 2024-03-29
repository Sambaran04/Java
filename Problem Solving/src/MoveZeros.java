public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int insertPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }
        while (insertPosition < nums.length){
            nums[insertPosition++] =0;
        }
    }
}
