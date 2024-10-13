package homework4.task_1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Answer_1 {
    public static void removeOddLengthStrings(LinkedList<String> list) {
        LinkedList<String> remove = new LinkedList<>();
        for (String s : list) {
            if (s.length() % 2 != 0)
                remove.add(s);
        }
        list.removeAll(remove);
    }
}
