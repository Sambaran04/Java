public class Exercise {
    public static void main(String[] args) {
        double a=20;
        double b=80;
        int c= (int)(a+b)*25;
        System.out.println("My Total: "+c);
        int remain = c % 40;
        if (remain <=20){
            System.out.println("Total was over the limit");
        }
    }
}