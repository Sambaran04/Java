public class Datatypes {
    public static void main(String[] args) {
        byte mybyteNum = 125;
        short myShortNum = 512;
        int myIntNum = 1024;
        long myLongNum = 50000L + 10L*(mybyteNum + myShortNum + myIntNum);
        System.out.println(myLongNum);
        float pound = 200f;
        double kg = 0.45359237d * pound;
        System.out.println("My pound value is: "+pound);
        System.out.println("My kg value is: "+kg);
        char mycharacter = '\u00AE';
        System.out.println("My unicode is: "+mycharacter);
    }
}
