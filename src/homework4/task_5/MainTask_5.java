package homework4.task_5;

import java.util.Deque;
import java.util.LinkedList;

public class MainTask_5 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        String value;
        deque.add("apple");
        deque.add("banana");
        deque.add("apple");
        deque.add("cherry");
        value = "apple";
        Answer_5 ans = new Answer_5();
        ans.removeAllOccurrences(deque, value);
    }
}
