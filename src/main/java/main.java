import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        System.out.println("Before");
        System.out.println(Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;

        QuickSort.quickSort(array, left, right);
        System.out.println("After");
        System.out.println(Arrays.toString(array));

        array = new int[]{10, 5, 8, 7, 1, 14, 12, 16, 9};
        ShakeSort.shakeSort(array, left, right);
        System.out.println("ShakeSort");
        System.out.println(Arrays.toString(array));

    }
}
