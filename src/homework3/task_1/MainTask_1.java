package homework3.task_1;

public class MainTask_1 {
    public static void main(String[] args) {
        Answer_1 ans = new Answer_1();
        int[] array = {-1, 2, -1, 3, 6, -8};
        int[] newArr = ans.filterNegativeNumbersInArray(array);
ans.printArray(newArr);
    }
}
