class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int ec) {
        int n=can.length;
        List<Boolean> ans= new ArrayList<>();
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(can[i]>max)
            {max=can[i];}

        }
       for(int i=0;i<n;i++)
       {
          if((can[i]+ec)>=max)
          {
            ans.add(true);
          }
           else
           {
               ans.add(false);
           }
       }
        /*for(int i=0;i<n;i++)

            sum=can[i]+ec;
            int count=0;
            for(j=0;j<n;j++)
            {
               if(sum>=can[j])
               {count++;}
            }
            if(count==n)
            {
             ans.add(true);
            }
            else
            {ans.add(false);}

        }*/
        return ans;


    }
}
