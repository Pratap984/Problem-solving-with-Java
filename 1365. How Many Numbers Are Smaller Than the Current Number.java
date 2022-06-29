class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n= nums.length;
        int[] temp=new int[101];
        for(int i=0;i<n;i++)
        {
            temp[nums[i]]++;
        }
        for(int i=0;i<n;i++)
        {   int j=0,sum=0;
            while(j!=nums[i])
            {
                sum=sum+temp[j];
                j++;
            }
            nums[i]=sum;
        }
        return nums;

    }
}
