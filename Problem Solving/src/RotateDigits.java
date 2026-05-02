class RotateDigits {

    public static void main(String[] args){
        int[] values = {10, 1, 2};
        for(int i: values){
            System.out.println(rotatedDigits(i));
        }
    }
    public static int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isGood(i)) count++;
        }
        return count;
    }

    private static boolean isGood(int x) {
        boolean different = false;
        while (x != 0) {
            int d = x % 10;
            if (d == 3 || d == 4 || d == 7) return false; // invalid rotation
            if (d == 2 || d == 5 || d == 6 || d == 9) different = true; // changes value
            x /= 10;
        }
        return different;
    }
}
