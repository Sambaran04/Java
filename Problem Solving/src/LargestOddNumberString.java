public class LargestOddNumberString {
    public static void main(String[] args) {
        String num = "35427";
        for(int i=num.length()-1; i>=0; i--){
            int digit = num.charAt(i);
            if(digit % 2 != 0){
                System.out.println(num.substring(0, i+1));
            }
        }
        System.out.println(" ");
    }
}