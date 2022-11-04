import java.util.Arrays;

/**
 * create by Zaryvnoire Alexandr on 04.11.2022
 **/
public class BinarySearchSolution {
    public static int[] ints = new int[]{6, 2, 9, 3, 1, 4, 5, 10, 7, 8};

    public static void main(String[] args) {
        Arrays.sort(ints);
    }

    public static int binarySearch(int[] ints, int item) {
        int low = 0;
        int high = ints.length;
        int mid = 0;
        int guess = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            guess = ints[mid];
            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else if (guess < item) {
                low = mid + 1;
            }
        }

        return mid;
    }
}
