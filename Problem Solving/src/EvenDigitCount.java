public class EvenDigitCount {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int digit = findNumbers(nums);
        System.out.println(digit);
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for (int element : nums){
            if (even(element)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int element){
        if (element==0){
            return true;
        }
        else if (element<0){
            element *= (-1);
        }
        String ele = Integer.toString(element);
        int n = ele.length();
        if (n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}