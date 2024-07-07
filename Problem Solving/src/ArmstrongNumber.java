public class ArmstrongNumber {
    public static void main(String[] args) {
        int x = 153 ;
        int a = x;
        int n = String.valueOf(x).length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int current = a%10;
            ans += (int) Math.pow(current, 3);
            a /=10;
        }
        if (ans==x){
            System.out.print("true");
        }
        else System.out.print("false");
    }
}
