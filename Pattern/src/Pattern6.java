import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 2*n; i++) {

            int c = i > n ? 2*n-i : i;

            for (int j = 0; j < n-c; j++) {
                System.out.print("  ");
            }
            for (int j = c; j >=1 ; j--) {
                System.out.print(j+ " ");
            }
            for (int j = 2; j <= c; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
