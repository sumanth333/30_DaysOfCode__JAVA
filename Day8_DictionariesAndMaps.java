
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String,String> Dictionary = new HashMap<String,String>();
        
        
        for(int i = 0; i < n; i++)
        {
            String name = in.next();
            String phone = in.next();
            Dictionary.put(name,phone);
            
        }
        while(in.hasNext())
        {
            String s = in.next();
            String Number = Dictionary.get(s);
            if(Number!=null)
                System.out.println(s+"="+Number);
            else
                System.out.println("Not found");
        }
        in.close();
    }
}

