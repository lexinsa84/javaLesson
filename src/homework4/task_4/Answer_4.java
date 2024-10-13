package homework4.task_4;

import java.util.Deque;

public class Answer_4 {
    public static void rotateDeque(Deque<Integer> deque, int n) {
        n = n % deque.size();
        if (n < 0) {
            n += deque.size();
        }
        for (int i = 0; i < n; i++) {
            deque.addLast(deque.removeFirst());
        }
        System.out.println(deque);
    }

}
