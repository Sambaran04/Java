public class PowerOfTwo {
    public static void main(String[] args) {
        long n = 5;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(long n){
        if(n>=1){
            return (n & (n - 1)) == 0;
        }
        return false;
    }
    public static boolean isPowerOfTwo(int n) {
        boolean flag=false;
        if(n==1){
            return true;
        }
        else if(n>1){
            if(n%2==0){
                n/=2;
                flag = true;
                return isPowerOfTwo(n);
            }else{
                return flag;
            }
        }
        return flag;
    }
}
