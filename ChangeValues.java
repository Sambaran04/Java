public class ChangeValues {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a: "+a+"\t b: "+b);
        swap(a, b);
        System.out.println("a: "+a+"\t b: "+b);
    }
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
