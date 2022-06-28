class Solution {
    public int subtractProductAndSum(int n) {

        int rem,sum=0,pro=1;
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            sum=sum+rem;
            pro=pro*rem;
        }
        int ans=(pro-sum);
        return(ans);

    }
}
