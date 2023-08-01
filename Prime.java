public class Prime {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        int c = 2;
        boolean flag = true;
        while (c<=Math.sqrt(num)){
            if (num%c==0){
                flag = false;
                break;
            }
            c++;
        }
        if (flag){
            System.out.println("This is a Prime number");
        }
        else{
            System.out.println("This is not a prime number");
        }
    }
}
