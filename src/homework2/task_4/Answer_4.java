package homework2.task_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Answer_4 {

    private static void logStep(int min, int max) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String timestamp = formatter.format(new Date());

        String logEntry = timestamp + " " + min + ", " + max;

        FileWriter logFile = null;
        try {

            File file = new File(".","log.txt");
            if (file.createNewFile()) {
                System.out.println("Файл log.txt был создан.");
            }

            logFile = new FileWriter(file, true);
            logFile.write(logEntry + "\n");
            logFile.flush();
            System.out.println("Записано в лог: " + logEntry);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        } finally {

            if (logFile != null) {
                try {
                    logFile.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла: " + e.getMessage());
                }
            }
        }
    }

    public static void logMinMax(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Массив пуст.");
            return;
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        logStep(min, max);
    }
}
