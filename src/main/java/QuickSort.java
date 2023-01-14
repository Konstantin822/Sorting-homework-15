public class QuickSort {

    public static void quickSort(int[] array, int left, int right) {
        int middle = left + (right - left) / 2;
        int footing = array[middle];

        if (array.length == 0)
            return;

        if (left >= right)
            return;

        int i = left;
        int j = right;
        while (i <= j) {
            while (array[i] < footing) {
                i++;
            }
            while (array[j] > footing) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(array, left, j);
        }
        if (right > i) {
            quickSort(array, i, right);
        }
    }
}
