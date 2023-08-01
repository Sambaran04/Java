public class Fibonacci_Series {
    public static void main(String[] args) {
        int upper = Integer.parseInt(args[0]);
        System.out.print("Fibonacci Series is: ");
        fib(upper);
    }
    public static void fib(int upper){
        int n1=0, n2=1, next=0;
        for (int i=0; i<upper; i++){
            System.out.print(n1+", ");
            next = n1+n2;
            n1 = n2; 
            n2 = next;
        }
    }
}
