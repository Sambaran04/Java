public class PowerOfThree {
    public static void main(String[] args) {
        int n=27;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        boolean flag = false;

        if(n==1){
            return true;
        }else if(n>1){
            if(n%3==0){
                n/=3;
                flag=true;
                return isPowerOfThree(n);
            }else{
                flag=false;
            }
        }
        return flag;
    }
}
