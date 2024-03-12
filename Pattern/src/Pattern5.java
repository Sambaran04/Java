import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        for (int i = 0; i < 2*n; i++) {
            int totalColdInRow = i > n ? 2 * n - i : i;

            int spaces = n-totalColdInRow;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalColdInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
