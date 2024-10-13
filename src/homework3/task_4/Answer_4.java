package homework3.task_4;

import java.util.Random;
import java.util.Scanner;

public class Answer_4 {
    public static int calculateAverage(int[] arr) {
        if (arr.length == 0)
            return 0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (int) Math.round((double) sum / arr.length);
    }

    static void printArray(int[] arrayForPrint) {
        System.out.printf("[ ");
        for (int i = 0; i < arrayForPrint.length; i++) {
            System.out.printf("" + arrayForPrint[i] + " ");
        }
        System.out.printf("]");
        System.out.println();
    }

    static int[] generateArray(int size, int minRange, int maxRange) {
        int[] tempArray = new int[size];
        Random temp = new Random();
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = temp.nextInt(minRange, maxRange + 1);
        }
        return tempArray;
    }

    static int readInt(String msg) {
        System.out.println(msg);
        Scanner iScanner = new Scanner(System.in);
        int size = iScanner.nextInt();
        return size;
    }
}
