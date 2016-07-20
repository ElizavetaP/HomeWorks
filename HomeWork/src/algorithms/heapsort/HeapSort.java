package algorithms.heapsort;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 3, 6,99,88,400,6,5};
        heapsort(array);
        for (int j : array) {
            System.out.println(j);
        }
    }

    private static void heapsort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len - 2; i++) {
            tree(array, i);
        }
        if(array[len-1]>array[len-2]){
            int temp = array[len-1];
            array[len-1] = array[len-2];
            array[len-2] = temp;
        }
    }
    private static void tree(int[] array, int start) {
        int len = array.length;

        for (int i = (len + start) / 2 ; i >= start; i--) {
            if (2 * (i-start) + 2 + start < len)  {
                if(array[2 * (i-start) + 2 + start]>array[2 * (i-start) + 1 +start] && array[2 * (i-start) + 2 + start] > array[i]) {
                    int temp = array[2 * (i-start) + 2 + start];
                    array[2 * (i-start)+ 2 + start] = array[i];
                    array[i] = temp;
                }else if (array[2 * (i-start) + 1 + start]>array[2 * (i-start) + 2 + start] && array[2 * (i-start) + 1 +start] > array[i]){
                    int temp = array[2 * (i-start) + 1 + start];
                    array[2 * (i-start) + 1 + start] = array[i];
                    array[i] = temp;
                }
            } else if ((2 * (i-start) + 1 +start < len) && array[2 * (i-start) + 1 +start] > array[i]) {
                int temp = array[2 * (i-start) + 1 + start];
                array[2 * (i-start) + 1 + start] = array[i];
                array[i] = temp;
            }
        }
    }
}
