package homework4.task_1;

import java.util.LinkedList;

public class MainTask_4 {
    public static void main(String[] args) {
        LinkedList<String> removeList = new LinkedList<>();
        removeList.add("apple");
        removeList.add("banana");
        removeList.add("pear");
        removeList.add("grape");
        System.out.println(removeList);
        Answer_1 ans = new Answer_1();
        ans.removeOddLengthStrings(removeList);
        System.out.println(removeList);
    }
}
