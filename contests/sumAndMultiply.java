class Solution {
    public long sumAndMultiply(int n) {
        int sum=0,dig;
        long x1;
        String x="";
        while(n!=0)
        {
            dig = n%10;
            if(dig!=0)
            {
                x = dig+x;
                sum = sum+dig;
            }
            n/=10;
                
        }
        if(x.equals(""))
            return 0;
        x1 = Long.parseLong(x);
        return x1*sum;
        
        
    }
}