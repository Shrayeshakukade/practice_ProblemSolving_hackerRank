import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        /*
        Set<Character> letter = new HashSet<Character>();
        
        char [] charS1 = s1.toCharArray();
        for(char ch : charS1){
            letter.add(ch);
        } 
        
        for(char ch : s2.toCharArray()){
            if(letter.contains(ch) == true)
                return "YES";
        }
        
        return "NO";
        */
        String [] array1 = s1.split("");
        String [] array2 = s2.split("");
        
        Set<String> set1 = new HashSet();
        Collections.addAll(set1, array1);
        
        Set<String> set2 = new HashSet();
        Collections.addAll(set2, array2);
        
        boolean result = Collections.disjoint(set1, set2);
        if (result)
            return "NO";
        else 
            return "YES";
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
