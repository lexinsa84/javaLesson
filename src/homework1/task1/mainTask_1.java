package homework1.task1;

public class mainTask_1 {
    public static void main(String[] args) {
        Answer_1 ans = new Answer_1();
        int number = ans.readInt("ведите число: ");
        System.out.println("Факториал числа " + number + " равен: " + ans.recursionFindFactorial(number));
        System.out.println("Факториал числа " + number + " равен: " + ans.findFactorial(number));
    }
}
