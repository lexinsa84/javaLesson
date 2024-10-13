package homework1.task1;

import java.util.Scanner;

public class Answer_1 {
    static int readInt(String msg) {
        System.out.println(msg);
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        return num;
    }

    static long recursionFindFactorial(int num) {
        if (num == -1 || num == 0) {
            return 1;
        }
        return num * recursionFindFactorial(num - 1);
    }

    static long findFactorial(int num) {
        if (num == -1) {
            return 1;
        }
        long fac = 1;
        for (int i = 2; i <= num; i++) {
            fac *= i;
        }
        return fac;
    }
}