class Solution {
    public int solve(int [] nums,int start,int end)
    {
        // if(nums.length==1)return nums[0];
        // if(nums.length==2)return Math.max(nums[start],nums[end]);
        if(start==end)return nums[start];
        int dp[]=new int[nums.length];
        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<nums.length;i++)
        {
            int rob=nums[i]+dp[i-2];
            int not_rob=dp[i-1];
            dp[i]=Math.max(rob,not_rob);
        }
        return dp[end];

    }
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int ans1=solve(nums,0,nums.length-2);
        int ans2=solve(nums,1,nums.length-1);
        return Math.max(ans1,ans2);

        
    }
}