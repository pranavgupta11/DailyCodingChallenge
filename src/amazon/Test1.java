package amazon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class Test1 {
    
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int logsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> logs = new ArrayList<>();

        for (int i = 0; i < logsCount; i++) {
            String logsItem = bufferedReader.readLine();
            logs.add(logsItem);
        }

        int threshold = Integer.parseInt(bufferedReader.readLine().trim());*/
        
        List<String> r = new ArrayList<>();
        r.add("1000");
        r.add("1010");
        r.add("1110");
        r.add("1111");

        //List<String> result = processLogs(r, 2);
        //for (int i = 0; i < result.size(); i++) {
            //System.out.print(result.get(i)+" ");
        //}
        /*for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
        
        countGroups(r);
    }
    
    public static void countGroups(List<String> related) {
        int n = related.size();
        
        int[][] M= new int[n][n];
        for(int i=0; i<related.size(); i++) {
            for(int j=0; j<related.size(); j++) {
        	System.out.println(related.get(i).charAt(j));
            M[i][j] = Integer.parseInt(related.get(j));
        }
        }
        
        }
    
    public static List<String> processLogs(List<String> logs, int threshold) {
    HashMap<String,Integer> countMap = new HashMap<>();
    //To store unique values of resulting list
    HashSet<String> result = new HashSet<>();
    
    for(String logsEntry: logs) {
        String[] transaction_log = logsEntry.split(" ");
        String userID_sender = transaction_log[0];
        String userID_receiver = transaction_log[1];
        
        //find if the transaction count exists for sender
        int userID_sender_count = countMap.getOrDefault(userID_sender, 0) + 1;
        countMap.put(userID_sender, userID_sender_count);
        if(userID_sender_count >= threshold){
            result.add(userID_sender);
        }
        
        //find if the transaction count exists for receiver, provided sender receiver are different.
        if(userID_sender != userID_sender){
                int userID_receiver_count = countMap.getOrDefault(userID_receiver, 0) + 1;
            countMap.put(userID_receiver, userID_receiver_count);
            if(userID_receiver_count >= threshold){
                result.add(userID_receiver);
            }
        }
        
        }
    
    return new ArrayList<>(result);
    }

}
