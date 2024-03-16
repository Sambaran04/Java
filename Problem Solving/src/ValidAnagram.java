import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        if (a.length != b.length){
            return false;
        }else {
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < a.length; i++) {
                if (a[i] !=b[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
