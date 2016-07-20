package algorithms.quicksort;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] a = {2, 55, 4, 2, 100, 6, 8, 0, 5, 5, 5, 5, 4};
        quicksort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    static void quicksort(int[] a) {
        int start = 0;
        int end = a.length;
        quicksort(a, start, end);
    }

    static void quicksort(int[] a, int start, int end) {

        int left = start;
        int right = end - 1;
        if (left >= right) {
            return;
        }
        int y = 0;
        int m = left / 2 + (right - left) / 2;
        while (left < right) {
            while (left < m && a[left] <= a[m]) {
                left++;
            }
            while (right > m && a[right] >= a[m]) {
                right--;
            }

            for (int i = start; i<end; i++) {
                System.out.println(a[i]);
            }
            System.out.println();

            if(left>right){
                System.out.println("jjjjjj");
                int temp = left;
                left = right;
                right= temp;
            }

            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                if (left == m) {
                    m = right;
                } else if (right == m) {
                    m = left;
                }
            }
        }

        quicksort(a, start, m);
        quicksort(a, m + 1, end);

    }
}
