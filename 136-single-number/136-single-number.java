class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>hp=new HashMap<>();
        int x=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(hp.containsKey(nums[i]))
            {
                hp.put(nums[i],hp.get(nums[i])+1);
            }
            else
            {
                hp.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(hp.get(nums[i])==1)
            {
                 x=nums[i];
            }
        }
        return x;
    }
}