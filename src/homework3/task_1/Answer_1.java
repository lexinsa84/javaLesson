package homework3.task_1;

import java.util.ArrayList;
import java.util.List;

public class Answer_1 {
    public static int[] filterNegativeNumbersInArray(int[] arr) {
        ArrayList<Integer> filterNegative = new ArrayList<>();
        for (int i : arr) {
            if (i >= 0) {
                filterNegative.add(i);
            }
        }
        int[] filterNegativeArr = new int[filterNegative.size()];
        for (int i = 0; i < filterNegative.size(); i++) {
            filterNegativeArr[i] = filterNegative.get(i);
        }
        return filterNegativeArr;
    }

    static void printArray(int[] arrayForPrint) {
        System.out.printf("[ ");
        for (int i = 0; i < arrayForPrint.length; i++) {
            System.out.printf("" + arrayForPrint[i] + " ");
        }
        System.out.printf("]");
        System.out.println();
    }
}

