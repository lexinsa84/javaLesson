package homework1.task_2;

public class MainTask_2 {
    public static void main(String[] args) {
        Answer_2 ans = new Answer_2();
        System.out.println("Введите диапозон:");
        int min = ans.readInt("Минимум:");
        int max = ans.readInt("Максимум:");
        ans.printEvenNums("Четные числа от "+min+" до " +max+" :",min,max);
    }

}
