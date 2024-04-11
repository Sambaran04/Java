public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
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
