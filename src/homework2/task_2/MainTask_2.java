package homework2.task_2;

public class MainTask_2 {
    public static void main(String[] args) {
        String[] headers = {"Name", "Age", "City"};

        // Пример данных
        String[][] data = {
                {"John", "25", "New York"},
                {"Anna", "30", "Los Angeles"},
                {"Mike", "22", "Chicago"}
        };
        Answer_2 ans = new Answer_2();
        // Создаем CSV
        String csv = ans.createCSV(headers, data);
        System.out.println(csv);
    }
}
