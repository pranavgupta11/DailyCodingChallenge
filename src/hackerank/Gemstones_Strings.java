package hackerank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones_Strings {
    public static void main(String[] args) {
	//BufferedWriter bufferedWriter;
	try {
	    //bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        
        Set<Character> gemstones = stringToSet(input.nextLine()); //Set of gemstones
        
        for(int i=1; i<n ;i++){
            gemstones.retainAll(stringToSet(input.nextLine())); //Perform intersection
        }
        System.out.print(gemstones.size());
        //int result = gemstones(arr);

        //bufferedWriter.write(gemstones.size());
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        input.close();
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
    public static Set<Character> stringToSet(String s) //Converts String to Character set
    {
        Set<Character> set = new HashSet<Character>(26);
        for (char c : s.toCharArray())
            set.add(Character.valueOf(c));
        return set;
    }
}
