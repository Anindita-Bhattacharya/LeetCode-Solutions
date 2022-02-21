class Solution {
    public int majorityElement(int[] nums) 
    {
        HashMap <Integer,Integer>hp=new HashMap<Integer,Integer>();
        int n=0;
        int max=0;
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
            if(hp.get(nums[i])>max)
            {
                max=hp.get(nums[i]);
                n=nums[i];
            }
        }
        return n;
        
    }
}