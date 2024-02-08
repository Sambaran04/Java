public class Exercise {
    public static void main(String[] args) {
        int num =4;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean  isPerfectSquare(int num) {
        if(num <=1){
            return true;
        }
        for(int i=2; i<=num/2; i++){
            if((i*i)==num){
                return true;
            }
        }
        return false;
    }
}
