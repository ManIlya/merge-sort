package ru.vsu.cs.manukovsky;

import java.util.Arrays;
import java.util.Random;

public class TestMergeSort {
    public void testSort() {
        Random random = new Random();
        int[] arr1 = new int[1000];
        int[] arr2 = new int[1000];
        for(int i = 0; i < 1000; i++){
            arr1[i] = random.nextInt(10000);
            arr2[i] = arr1[i];
        }
        int[] result = MergeSort.mergeSort(arr1);
        Arrays.sort(arr2);
        System.out.println("правильность алгоритма " + arrEqual(result, arr2));
    }

    public static boolean arrEqual(int[] arr1, int[] arr2){
        for(int i = 0; i < 1000; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
