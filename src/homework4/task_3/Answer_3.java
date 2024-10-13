package homework4.task_3;

import java.util.LinkedList;

public class Answer_3 {
    public static int countOccurrences(LinkedList<String> list, String value) {
        int count = 0;
        for (String s : list) {
            if (s.equals(value)) {
                count++;
            }
            if (list == null&&count==0) {
                return count;
            }
        }
        return count;
    }

}
