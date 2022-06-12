// code start

class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0,max=0;
       HashSet<Integer> hs= new HashSet<>();
        for(int i : nums)
        {
            hs.add(i);
        }
        for(int i=0;i<nums.length;i++)
        {
           if(!hs.contains(nums[i]-1))
           {
               count=0;
               int current=nums[i];
               while(hs.contains(current++))
                   count++;
              if(count>max)
                  max=count;
           }
        }
        return max;
    }
}

// code end

