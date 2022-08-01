class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int ans[]=new int[2];
        HashMap<Integer,Integer>hp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int x=target-nums[i];
            if(hp.containsKey(x))
            {
                ans[0]=hp.get(x);
                ans[1]=i;
            }
            else
            {
                hp.put(nums[i],i);
            }
        }
        return ans;
        
    }
}