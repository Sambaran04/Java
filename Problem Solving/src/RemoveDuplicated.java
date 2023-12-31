public class RemoveDuplicated {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.print(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int[] arr = new int[nums.length];
        if (nums.length == 0){
            return 1;
        }
        else{
            for(int i=0; i<nums.length;i++){
                for (int j=i+1; j<nums.length; j++){
                    if (nums[i]==nums[j]){
                        continue;
                    }
                    else{
                        arr[i] = nums[i];
                    }
                }
            }
            return arr.length;
        }
    }
}
