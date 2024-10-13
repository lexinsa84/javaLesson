package task1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private StudentDirectory studentDirectory = new StudentDirectory();
    private Scanner scanner = new Scanner(System.in);

    public void start() {

        while (true) {
            try {
                System.out.println("\n1. Добавить/Обновить Студента");
                System.out.println("2. Найти Студента");
                System.out.println("3. Получить Всех Студентов");
                System.out.println("4. Удалить Студента");
                System.out.println("5. Выход");
                System.out.print("Выберите опцию: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        findStudent();
                        break;
                    case 3:
                        getAllStudents();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        System.out.println("Выход из программы...");
                        return;
                    default:
                        System.out.println("Неверный выбор, попробуйте еще раз.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введите число от 1 до 5!!!");
                scanner.nextLine();
            }
        }
    }
    private void addStudent() {
        System.out.print("Введите имя студента: ");
        String name = scanner.nextLine();
        System.out.print("Введите оценку студента: ");
        int grade = scanner.nextInt();
        studentDirectory.addStudent(name, grade);
        System.out.println("Студент успешно добавлен/обновлён.");
    }

    private void findStudent() {
        System.out.print("Введите имя студента: ");
        String name = scanner.nextLine();
        List<Integer> grades = studentDirectory.findStudent(name);
        if (grades.isEmpty()) {
            System.out.println("Студент не найден.");
        } else {
            System.out.println("Оценки " + name + ": " + grades);
        }
    }

    private void getAllStudents() {
        Map<String, List<Integer>> students = studentDirectory.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("Нет студентов.");
        } else {
            for (Map.Entry<String, List<Integer>> entry : students.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    private void removeStudent() {
        System.out.print("Введите имя студента для удаления: ");
        String name = scanner.nextLine();
        studentDirectory.removeStudent(name);
        System.out.println("Студент удалён (если существовал).");
    }
}
