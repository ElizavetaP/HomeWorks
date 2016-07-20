package algorithms.heapsort;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 3, 5, 9, 44, 2, 90};
        heapsort(array);
    }

    private static void heapsort(int[] array) {
        int len = array.length;
        for (int i = 0; i < Math.log(array.length) / Math.log(2) - 1; i++) {
            tree(array, 0);
            for (int j : array) {
                System.out.println(j);
            }
            System.out.println();
        }
        for (int i = 1; i < len - 2; i++) {
            tree(array, i);
            for (int j : array) {
                System.out.println(j);
            }
            System.out.println();
        }
    }
    private static void tree(int[] array, int start) {
        int len = array.length;
        for (int i = start; i < (len + start) / 2 + 1; i++) {

            if ((2 * i + 2 < len) && array[2 * i + 2] > array[i]) {
                if(array[2 * i + 2]>array[2 * i + 1] && array[2 * i + 2] > array[i]) {
                    int temp = array[2 * i + 2];
                    array[2 * i + 2] = array[i];
                    array[i] = temp;
                }else if (array[2 * i + 1]>array[2 * i + 2] && array[2 * i + 1] > array[i]){
                    int temp = array[2 * i + 1];
                    array[2 * i + 1] = array[i];
                    array[i] = temp;
                }
            } else if ((2 * i + 1 < len) && array[2 * i + 1] > array[i]) {
                int temp = array[2 * i + 1];
                array[2 * i + 1] = array[i];
                array[i] = temp;
            }
        }
    }
}
