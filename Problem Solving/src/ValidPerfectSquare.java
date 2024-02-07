public class ValidPerfectSquare {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPerfectSquare(n));
    }
    public static boolean  isPerfectSquare(int num) {
        long high = 10000000;
        long low = 1;
        long mid;
        long sq;

        while(low<=high){
            mid = low+(high-low)/2;
            sq = mid*mid;
            if(sq==num){
                return true;
            }else if(sq>num){
                high =mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
}