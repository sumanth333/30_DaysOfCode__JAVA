import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int ans = factorial(n);
        
        System.out.println(ans);
    }
    public static int factorial(int n)
    {
        if(n==0)
            return 1;
        return n* factorial(n-1);
    }
}
