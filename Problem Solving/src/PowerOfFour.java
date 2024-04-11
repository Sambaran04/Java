public class PowerOfFour {
    public static void main(String[] args) {
        long n = 16;
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
        boolean flag=false;
        if(n==1){
            return true;
        }
        else if(n>1){
            if(n%4==0){
                n/=4;
                flag = true;
                return isPowerOfFour(n);
            }else{
                return flag;
            }
        }
        return flag;
    }
}
