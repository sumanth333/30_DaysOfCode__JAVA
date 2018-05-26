import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int numOfSwaps=0,temp=-1;
        for(int i=0; i<n;++i)
        {
            if(numOfSwaps>temp)
            {
                temp = numOfSwaps;
                for(int j=0;j<n-i-1;++j)
                {
                    if(a[j]>a[j+1])
                    {
                        a[j] = a[j] ^ a[j+1];
                        a[j+1] = a[j] ^ a[j+1];
                        a[j] = a[j] ^ a[j+1];

                        ++numOfSwaps;
                    }
                }
            }
        }
        
        System.out.println("Array is sorted in "+numOfSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}
