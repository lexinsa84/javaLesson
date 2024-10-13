package homework4.task_5;

import java.util.Deque;

public class Answer_5 {
    public static void removeAllOccurrences(Deque<String> deque, String value) {
        deque.removeIf(elements -> elements.equals(value));
        System.out.println(deque);
    }
}
