import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        for (int i=0; i<=n; i++){
            for (int j = n; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
