package homework1.task_2;

import java.util.Scanner;

public class Answer_2 {
    static int readInt(String msg) {
        System.out.println(msg);
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        return num;
    }
    static void printEvenNums(String msg,int a,int b){
        System.out.println(msg);
        for (int i = a; i <= b; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
