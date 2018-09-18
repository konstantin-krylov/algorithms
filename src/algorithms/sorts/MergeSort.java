package algorithms.sorts;

import java.util.Arrays;

public class MergeSort {
    private void SortUnsorted(int[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a1 = new int[] {13, 3, 8, 1, 15, 2, 3, 7, 4};
        MergeSort test = new MergeSort();
        test.SortUnsorted(a1,0,a1.length-1);
        for (int i : a1) {
            System.out.print(i + " ");
        }
    }

}
