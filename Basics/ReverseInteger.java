import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("The reverse of "+x+ " is: "+ reverse(x));
    }
    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int current = x % 10;
            if ((ans > Integer.MAX_VALUE / 10) || (ans < Integer.MIN_VALUE / 10)) {
                return 0;
            } else {
                ans *= 10;
                ans += current;
                x /= 10;
            }
        }
        return ans;
    }
}
