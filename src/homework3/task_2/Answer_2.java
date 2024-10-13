package homework3.task_2;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Answer_2 {
    int[] uniqueNumbersInArray(int[] arr) {
        LinkedHashSet<Integer> uniNumb = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniNumb.add(arr[i]);
        }
        int[] uniNumbArr = new int[uniNumb.size()];
        int index=0;
        for (Integer integer : uniNumb) {
            uniNumbArr[index++]=integer;
        }
        return  uniNumbArr;
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
