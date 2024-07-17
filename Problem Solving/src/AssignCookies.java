import java.util.Arrays;

public class AssignCookies {

    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1, 2, 3};
        System.out.println(findContentChildren(g, s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0, r=0;
        while (l<m && r<n){
            if (g[r]<=s[l]){
                r++;
            }
            l++;
        }
        return r;
    }
}
