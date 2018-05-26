import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        ArrayList<String> list = new ArrayList<String>();

        for (int NItr = 0; NItr < N; NItr++) 
        {
            String firstName = scanner.next();

            String emailID = scanner.next();
            
            if(firstName.length()<=20 && emailID.length()<=50)
            {
                Matcher matcher = pattern.matcher(emailID);
                if (matcher.find())
                    list.add(firstName); 
            }
        }
        
        Collections.sort(list);
        for(String name: list)
            System.out.println(name);

        scanner.close();
    }
}

