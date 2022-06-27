class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {return false;}
        else
        {   long rem=0,sum=0;
            long ori=x;
            while(x!=0)
            {
                rem=x%10;
                x=x/10;
                sum=sum*10+rem;
            }
         if(ori==sum)
         {
             return true;
         }
         else
         {
             return false;
         }
        }

    }
}
