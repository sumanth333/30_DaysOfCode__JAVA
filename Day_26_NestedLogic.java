import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        int fine=0,expectedDay,expectedMonth,expectedYear,returnedDay,returnedMonth,returnedYear;
        Scanner in = new Scanner(System.in);
        
        returnedDay = in.nextInt();returnedMonth = in.nextInt();returnedYear = in.nextInt();
        
        expectedDay = in.nextInt();expectedMonth = in.nextInt();expectedYear = in.nextInt();
        
        int yDiff = returnedYear - expectedYear;
        int mDiff = returnedMonth - expectedMonth;
        int dDiff = returnedDay - expectedDay;
        
        
        if(yDiff >0)
            System.out.println(10000);
        
        else if(yDiff ==0)
        {
            if(mDiff >0)
                System.out.println(mDiff * 500);
            else if(mDiff == 0)
            {
                if(dDiff>0)
                    System.out.println(dDiff * 15);
                else
                    System.out.println(0);
            }
            else
                System.out.println(0);
        }
        else
            System.out.println(0);
    }
}
