import java.util.Arrays;

public class LemonadeChange {

    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        System.out.println(Arrays.toString(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five=0, ten=0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five >= 1) {
                    ten++;
                    five--;
                } else {
                    return false;
                }
            } else {
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
