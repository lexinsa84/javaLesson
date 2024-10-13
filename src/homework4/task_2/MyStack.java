package homework4.task_2;

import java.util.LinkedList;

public class MyStack {
    private LinkedList<String> stack = new LinkedList<>();

    public void push(String element) {
        stack.addFirst(element);
    }

    public String pop() {
        return stack.removeFirst();
    }

    public String peek() {

        return stack.peekFirst();
    }

    public LinkedList<String> getElements() {
        return new LinkedList<>();

    }

    @Override
    public String toString() {
        return "{" +
                "stack=" + stack +
                '}';
    }
}
