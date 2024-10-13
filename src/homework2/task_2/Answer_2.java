package homework2.task_2;

public class Answer_2 {
    public static String createCSV(String[] headers, String[][] data) {
        StringBuilder csvBuilder = new StringBuilder();

        for (int i = 0; i < headers.length; i++) {
            csvBuilder.append(headers[i]);
            if (i < headers.length - 1) {
                csvBuilder.append(",");
            }
        }
        csvBuilder.append("\n");

        for (String[] row : data) {
            for (int i = 0; i < row.length; i++) {
                csvBuilder.append(row[i]);
                if (i < row.length - 1) {
                    csvBuilder.append(",");
                }
            }
            csvBuilder.append("\n");
        }

        return csvBuilder.toString();
    }
}
