package homework3.task_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Answer_3 {
    public static String[] filterShortStrings(String[] arr){
        ArrayList<String> arrayList= new ArrayList<>();
        for (String s : arr) {
            if(s.length()>3){
                arrayList.add(s);
            }
        }
        String[] filterArr=new String[arrayList.size()];
        for (int i = 0; i < filterArr.length; i++) {
            filterArr[i]=arrayList.get(i);
        }
        return filterArr;
    }
    static void printArray(String[] arrayForPrint) {
        System.out.printf("[ ");
        for (int i = 0; i < arrayForPrint.length; i++) {
            System.out.printf("" + arrayForPrint[i] + " ");
        }
        System.out.printf("]");
        System.out.println();
    }

    static String[] enterArray(int size, String msg) {
        System.out.println(msg);
        String[] tempArray = new String[size];
        Random temp = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i]=sc.next();
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
