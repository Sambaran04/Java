import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int originalN=n;
        n = 2*n;
        for (int i = 1; i <n; i++) {
            for (int j = 1; j <n; j++) {
                int atEveryIndex = originalN-Math.min(Math.min(i, j), Math.min(n-i, n-j))+1;
                System.out.print(atEveryIndex+ " ");
            }
            System.out.println();
        }
    }
}
