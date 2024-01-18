import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        Set<Integer> usedInt = new HashSet<>();

        while (true){
            int sum=0;
            while(n!=0){
                sum += (int) Math.pow(n%10, 2);
                n/=10;
            }
            if (sum==1) return true;

            n=sum;
            if (usedInt.contains(n)) return false;
            usedInt.add(n);
        }
    }
}
