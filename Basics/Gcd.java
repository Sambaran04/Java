import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gcd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of a: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of b: ");
        int b = Integer.parseInt((br.readLine()));

        int gcd = 1;

        for (int i = Math.max(a, b); i>=1; i--) {
            if (a%i ==0 && b%i==0){
                gcd = i;
                break;
            }
        }
        System.out.printf("Gcd: "+gcd);
    }
}
