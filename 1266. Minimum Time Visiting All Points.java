class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum=0,x,y;
        int n=points.length;
        for(int i=0;i<n-1;i++)
        {
            x=java.lang.Math.abs(points[i][0]-points[i+1][0]);
            y=java.lang.Math.abs(points[i][1]-points[i+1][1]);
            System.out.println(x);
            System.out.println(y);
            if(x==y)
            {
                sum=sum+x;
            }
            else if(x==0)
            {
                sum=sum+y;
            }
            else if(y==0)
            {
                sum=sum+x;
            }
            else
            {
                sum=sum+java.lang.Math.abs(x-y);
                sum=sum+Math.min(x,y);
            }

        }
        return(sum);

    }
}
