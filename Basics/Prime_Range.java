public class Prime_Range {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a>b){
            a = a+b;
            b = a-b;
            a = a-b;
        }
        for (int i=a; i<=b; i++){
            if(isPrime(i)){
                System.out.print(i+", ");
            }
        }
    }
    public static boolean isPrime(int n){
        for (int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
