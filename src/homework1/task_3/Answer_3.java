package homework1.task_3;

import java.util.Scanner;

public class Answer_3 {
    static int readInt(String msg) {
        System.out.println(msg);
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        return num;
    }

    static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
