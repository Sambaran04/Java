public class ValidPerfectSquare {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPerfectSquare(n));
    }
    public static boolean  isPerfectSquare(int num) {
        if (num < 2){
            return true;
        }
        for (int i = 2; i < num/2; i++) {
            if ((i*i)==num){
                return true;
            } else if ((i*i) > num){
                return false;
            }
        }
        return false;
    }
}