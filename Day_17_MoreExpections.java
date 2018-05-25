class Calculator
{
    int power(int n,int p) throws Exception
    {

        if(n < 0 || p <0)
        {
            throw new Exception("n and p should be non-negative");
        }
        else
        {
            if(p==0)
                return 1;
            int sq = n;
            while(p>1)
            {
                n = n*sq;
                --p;
            }
        }
        return n;
    }
}
