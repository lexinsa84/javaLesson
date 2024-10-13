package homework2.task_1;

public class Answer_1 {
    public static String buildUrl(String baseUrl, String params) {
        StringBuilder fullUrl = new StringBuilder(baseUrl);

        String[] pairs = params.split("&");
        boolean firstParam = true;

        for (String pair : pairs) {
            String[] keyValue = pair.split("=");

            if (keyValue.length == 2 && !keyValue[1].equals("null")) {
                if (firstParam) {
                    fullUrl.append("?");
                    firstParam = false;
                } else {
                    fullUrl.append("&");
                }
                fullUrl.append(keyValue[0]).append("=").append(keyValue[1]);
            }
        }

        return fullUrl.toString();
    }
}
