package homework4.task_3;

import java.util.LinkedList;

public class MainTask_3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String value;
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("pear");
        list.add("banana");
        list.add("apple");
        list.add("apple");
        value = "apple";
        Answer_3 ans = new Answer_3();
        System.out.println("Occurrences of \"" + value + "\": "
                + ans.countOccurrences(list, value));
    }

}
