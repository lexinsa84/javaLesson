package homework4.task_4;

import java.util.Deque;
import java.util.LinkedList;

public class MainTask_4 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        int n;
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        n = 7;
        Answer_4 ans = new Answer_4();
        ans.rotateDeque(deque, n);
    }
}
