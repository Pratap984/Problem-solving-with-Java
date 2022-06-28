class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer> a=new ArrayList<>();
        int rem=0;
        while(num!=0)
        {
            rem=num%10;
            num=num/10;
            a.add(rem);
        }
        int n=a.size();
        for(int i=n-1;i>=0;i--)
        {
            if(a.get(i)==6)
            {
                a.set(i,9);
                break;
            }
        }
        int temp=0;
        for(int j=n-1;j>=0;j--)
        {
            temp=temp*10+a.get(j);
        }
        return(temp);


    }
}
