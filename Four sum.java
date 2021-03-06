// code start

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    if(nums.length<4)
        return Collections.emptyList();
        
        Set<List<Integer>> hs= new HashSet<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-3;i++)
        {
            for(int l=nums.length-1;l>i;l--)
            {
                int j=i+1;
                int k=l-1;
                while(j<k)
                {
                    int sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target)
                        hs.add(Arrays.asList(nums[i],nums[j++],nums[k--],nums[l]));
                    else if(sum<target) 
                        j++;
                    else if(sum>target)
                        k--;
                }
            }
        }
        return new ArrayList<>(hs);
    }
}

// code end

