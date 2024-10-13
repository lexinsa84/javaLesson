package homework1.task_4;

import java.util.Scanner;

public class Answer_4 {
    static int readInt(String msg) {
        System.out.println(msg);
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        return num;
    }

    static int findMaxOfTwo(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }
    static int findMaxOfThree(int a,int b,int c){
        int max = findMaxOfTwo(findMaxOfTwo(a,b),c);
        return max;
    }
}
