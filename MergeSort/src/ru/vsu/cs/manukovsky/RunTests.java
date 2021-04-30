package ru.vsu.cs.manukovsky;

public class RunTests {
    public static void main(String[] args) {
        try {
            TestMergeSort testMergeSort = new TestMergeSort();
            testMergeSort.testSort();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
