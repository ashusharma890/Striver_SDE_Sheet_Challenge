// code start

class Solution {
    public List<Integer> majorityElement(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        List<Integer> list = new ArrayList<>();
        int n = nums.length/3;
        for(Map.Entry<Integer,Integer> hmap : map.entrySet()){
            if(hmap.getValue() > n){
                list.add(hmap.getKey());
            }
        }
        return list;
    }
}

// code end

