class Solution {
    public int maximumWealth(int[][] acc) {
        int n=acc.length,sum=0,temp=0;
        for(int i=0;i<n;i++)
        {   sum=0;
            for(int j=0;j<acc[i].length;j++)
            {
                sum=sum+acc[i][j];
            }
            if(sum>temp) temp=sum;
        }
        return temp;
    }
}
