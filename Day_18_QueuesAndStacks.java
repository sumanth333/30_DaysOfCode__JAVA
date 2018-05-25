public class Solution 
{
    ArrayList<Character> stack = new ArrayList<Character>();
    ArrayList<Character> queue = new ArrayList<Character>();
    void pushCharacter(char ch)
    {
        stack.add(ch);
    }
    char popCharacter() 
    {
        char c = stack.get(0);
        stack.remove(0);
        
        return c;
    }
    void enqueueCharacter(char ch)
    {
        queue.add(ch);    
    }
    char dequeueCharacter()
    {
         char c = queue.get(queue.size()-1);
        queue.remove(queue.size()-1);
        
        return c;
    }
