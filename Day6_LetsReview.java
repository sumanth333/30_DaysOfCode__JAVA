import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        in.nextLine();
        while(tests-- > 0)
        {
            String original = in.nextLine();
            String Even = "",Odd = "";
            int length = original.length();
            
            for(int i=0;i<length;++i)
            {
                if(i%2==0)
                Even += original.charAt(i);
                else
                 Odd +=original.charAt(i);
            }
            System.out.println(Even+" "+Odd);
        }
    }
}
