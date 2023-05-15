class Solution {
    public int rob(int[] nums) 
    {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);

    }
    public int solve(int [] arr,int i,int [] dp)
    {
       if(i>=arr.length)return 0;
       if(dp[i]!=-1)return dp[i];
       int robb=arr[i]+solve(arr,i+2,dp);
       int not_robb=solve(arr,i+1,dp);
       dp[i]=Math.max(robb,not_robb);
       return Math.max(robb,not_robb);

    }
}