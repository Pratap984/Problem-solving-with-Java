class Solution {
    public int mySqrt(int x) {
        
        if(x==0)
        {
            return 0;
        }

        else if(x==1)
        {
            return 1;
        }
    
        else
        {
            int s=1;
            int e=x/2;
           
            
            while(s<=e)
            {
                 int mid=s+((e-s)/2);
                 
                 if((mid)<(x/mid))
                 {
                     s=mid+1;
                 }
                 else if((mid)>(x/mid))
                 {
                     e=mid-1;
                     
                 }
                 else
                 {
                     return mid;
                 }

            }
            
            return e;
        }


        
    }
}
