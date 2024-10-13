package homework1.task_4;

public class MainTask_4 {
    public static void main(String[] args) {
        System.out.println("Введите числа для сравнения:");
        Answer_4 ans = new Answer_4();
        int a = ans.readInt("Введите первое число:");
        int b = ans.readInt("Введите второе число:");
        int c = ans.readInt("Введите третье число:");
        System.out.println("Максимальное число цифр: " + a + ", " + b + ", " + c + " равно: " + ans.findMaxOfThree(a, b, c));
    }
}
