package amazon;

public class PrintFirstLetter {
    
    public static void main(String[] args) {
	System.out.println(firstAlphabet("geeks for geeks"));
    }
    
   static String firstAlphabet(String S) {
        // code here
        S = S.trim();
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        for(int i=1;i<S.length();i++){
            if(S.charAt(i) == ' ') {
                sb.append(S.charAt(i+1));
            }
        }
        return sb.toString();
    }

}
