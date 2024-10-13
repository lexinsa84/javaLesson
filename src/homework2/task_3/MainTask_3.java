package homework2.task_3;

public class MainTask_3 {
    public static void main(String[] args) {
        String text = "Line 1\n\nLine 2\n   \nLine 3\n\n";
        Answer_3 ans = new Answer_3();
        String cleanedText = ans.removeEmptyLines(text);
        System.out.println(cleanedText);
    }
}
