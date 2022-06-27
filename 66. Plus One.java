class Solution {
    public int[] plusOne(int[] di) {
        int n= di.length,carry=1;
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
           sum=di[i]+carry;
            carry=0;
            if(sum==10)
            {
                sum=sum%10;
                carry=1;
            }
            di[i]=sum;
         }
        if(carry==1)
        {   int[] ans= new int[n+1];
            ans[0]=carry;
            for(int i=1;i<n+1;i++)
            {
                ans[i]=di[i-1];
            }
         return ans;

        }
        return di;
    }
}
