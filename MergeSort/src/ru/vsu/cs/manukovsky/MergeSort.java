package ru.vsu.cs.manukovsky;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = new int[arr.length];
        return sort(arr1, arr2, 0, arr.length);
    }

    public static int[] sort(int[] arr, int[] arr1, int p, int q) {
        if (p >= q - 1) {
            return arr;
        }

        int r = p + (q - p) / 2;
        int[] sort1 = sort(arr, arr1, p, r);
        int[] sort2 = sort(arr, arr1, r, q);

        int i = p;
        int j = r;
        int i1 = p;
        int[] result = sort1 == arr ? arr1 : arr;
        while (i < r && j < q) {
            result[i1++] = sort1[i] < sort2[j]
                    ? sort1[i++] : sort2[j++];
        }
        while (i < r) {
            result[i1++] = sort1[i++];
        }
        while (j < q) {
            result[i1++] = sort2[j++];
        }
        return result;
    }
}
