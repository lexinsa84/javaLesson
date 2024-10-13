package homework3.task_4;

public class MainTask_4 {
    public static void main(String[] args) {
        Answer_4 ans = new Answer_4();
        int size = ans.readInt("Введите размер массива: ");
        int[] array = ans.generateArray(size, 1, 9);
        ans.printArray(array);
        long average = ans.calculateAverage(array);
        System.out.println("Среднее арифметическое эллементов массива равно: " + average);
    }
}
