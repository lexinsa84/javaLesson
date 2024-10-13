package homework5.task4;

import java.util.Arrays;

public class MainTask4 {
    public static void main(String[] args) {
        int[] array = {12, 11, 55, 13, 5, 6, 7, 1};
        MergeSort mergeSort = new MergeSort();
        System.out.println("Исходный массив: " + Arrays.toString(array));
        mergeSort.mergeSort(array, 0, array.length - 1);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}

