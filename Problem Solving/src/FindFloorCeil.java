import java.util.Arrays;

public class FindFloorCeil {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 8, 6, 5, 5, 6};
        int x = 10;
        System.out.println(Arrays.toString(getFloorAndCeil(x, arr)));
    }
    public static int[] getFloorAndCeil(int x, int[] arr) {
        int floor = -1;
        int ceil = -1;

        for (int num : arr) {
            if (num <= x) {
                if (floor == -1 || num > floor) {
                    floor = num;
                }
            }
            if (num >= x) {
                if (ceil == -1 || num < ceil) {
                    ceil = num;
                }
            }
        }

        return new int[] { floor, ceil };
    }
}
