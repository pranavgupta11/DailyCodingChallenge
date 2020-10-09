package project_euler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Sample3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int m = Integer.parseInt(bufferedReader.readLine().trim());
        for (int k = 0; k < m; k++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                List<Integer> arrRowItems = new ArrayList<>();

                for (int j = 0; j < n; j++) {
                    int arrItem = Integer.parseInt(arrRowTempItems[j]);
                    arrRowItems.add(arrItem);
                }

                arr.add(arrRowItems);
            }

            int result = 0;

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}


