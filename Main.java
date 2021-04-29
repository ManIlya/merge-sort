package ru.vsu.cs.manukovsky;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43 };
        int[] result = mergesort(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergesort(int[] arr) {
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = new int[arr.length];
        int[] result = sort(arr1, arr2, 0, arr.length);
        return result;
    }

    public static int[] sort(int[] arr, int[] arr1, int p, int q) {
        if (p >= q - 1) {
            return arr;
        }

        int r = p + (q - p) / 2;
        int[] sort1 = sort(arr, arr1, p, r);
        int[] sort2 = sort(arr, arr1, r, q);

        // Слияние
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
