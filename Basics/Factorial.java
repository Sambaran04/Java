public class Factorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int fact =1;
        for (int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.print("The factorial "+n+" is: "+fact);
    }
}
