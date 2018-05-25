import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0,max=0;
        while(n>0)
        {
            int rem  = n%2;
            if(rem==1)
                count++;
            else
            {
                max = Math.max(count,max);
                count=0;
            }
            n/= 2;
        }
        max = Math.max(count,max);
        
        System.out.println(max);
    }
}
