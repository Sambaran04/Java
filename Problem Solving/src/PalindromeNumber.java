public class PalindromeNumber {
    public static void main(String[] args) {
        int num =121;
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int x) {
        String a = Integer.toString(x);
        int i=0;
        int j = a.length()-1;
        while(i<j){
            if(a.charAt(i) != a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
