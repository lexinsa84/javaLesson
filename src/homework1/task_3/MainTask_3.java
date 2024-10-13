package homework1.task_3;

public class MainTask_3 {
    public static void main(String[] args) {
        Answer_3 ans = new Answer_3();

        int number = ans.readInt("Введите число:");
        System.out.println("Сумма цифр числа " + number + " равна: " + ans.sumDigits(number));
    }
}
