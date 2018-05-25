class Student extends Person{
	private int[] testScores;

    Student(String firstName,String lastName, int id, int[] testScores)
    {
       super(firstName,lastName,id);
        this.testScores = testScores;
    }
    
    char calculate()
    {
        char c = 'T';
        float sum = 0;
        for(int i=0;i<testScores.length;++i)
        {
            sum += testScores[i];
        }
        sum /= testScores.length;
        
        if(sum>=40)
        {
            if(sum>= 55)
            {
               if(sum>=70)
               {
                  if(sum>=80)
                  {
                      if(sum>=90)
                      {
                          c = 'O';
                      }
                      else
                          c = 'E';
                  }
                   else
                       c = 'A';
               }
                else
                    c = 'P';
            }
            else
                c = 'D';
        }
        
        return c;
        
    }
}
