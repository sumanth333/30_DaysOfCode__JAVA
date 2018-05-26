import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        int testCases;
        Scanner in = new Scanner(System.in);
        
        testCases = in.nextInt();
        while(testCases-- >0)
        {
            boolean isPrime = true;
            int n = in.nextInt();
            double sqrRoot = Math.sqrt(n);
            
            if(n==1 || n<=0 )
                isPrime = false;
            
            else
            {
                for(int i=2; i<=sqrRoot ; ++i)
                {
                   if(n%i==0)
                   {
                       isPrime = false;
                       i = (int)sqrRoot;
                   }
                }
            }
            
            if(isPrime)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
            
        }
    }
}
