class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        int arrysize=0;
        for(int i=0;i<n;i+=2)
        {
            arrysize=arrysize+nums[i];
        }
        int[] ans=new int[arrysize];
        int j=0;
        int index_s=0;
        for(int i=0;i<n;i=i+2)
        {
            Arrays.fill(ans,index_s,index_s+nums[i],nums[i+1]);
            index_s+=nums[i];

        }
        return ans;


    }
}
