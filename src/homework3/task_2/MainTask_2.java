package homework3.task_2;

public class MainTask_2 {
    public static void main(String[] args) {
        Answer_2 ans = new Answer_2();
        int size = ans.readInt("Введите размер массива: ");
        int[] array = ans.generateArray(size, 1, 9);
        ans.printArray(array);
        ans.printArray(ans.uniqueNumbersInArray(array));
    }
}
