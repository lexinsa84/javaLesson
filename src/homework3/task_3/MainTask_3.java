package homework3.task_3;

import java.util.Arrays;

public class MainTask_3 {
    public static void main(String[] args) {
        Answer_3 ans = new Answer_3();
        int size = ans.readInt("Введите размер массива: ");
        String[] filterShortArray = ans.enterArray(size,"Введите строки:");
        ans.printArray(filterShortArray);
        System.out.println("Отфильтрованный массив: ");
        ans.printArray(ans.filterShortStrings(filterShortArray));
    }
}
