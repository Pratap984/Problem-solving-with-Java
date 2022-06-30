class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=1;i<=n;i=i+2)
        {
           for(int j=0;j<n;j++)
           {   int k=i;
               int r=j;
               while(k!=0 && r<n && k<=(n-r))
               {   System.out.println(arr[r]);
                   sum=sum+arr[r];
                   k--;
                   r++;

               }
           }
        }
        return(sum);

    }
}
