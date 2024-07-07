public class PrintNumber {
    public static void main(String[] args) {
        int x = 5;
        write(x);
    }
    public static void write(int x){
        System.out.print(x+" ");
        x -=1;
        if (x>0){
            write(x);
        }
    }
}
