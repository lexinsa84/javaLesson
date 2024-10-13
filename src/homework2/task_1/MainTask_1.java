package homework2.task_1;

public class MainTask_1 {
    public static void main(String[] args) {
        Answer_1 ans = new Answer_1();
        String baseUrl = "https://example.com/search";
        String params = "query=java&sort=desc&filter=null";
        String fullUrl = ans.buildUrl(baseUrl, params);
        System.out.println(fullUrl);
    }
}
