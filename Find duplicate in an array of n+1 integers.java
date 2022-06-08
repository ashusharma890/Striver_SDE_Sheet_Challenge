// code start

class Solution {
    public int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        int k=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i] && k!=arr[i])
            {
                k=arr[i];
            }
        }
        return k;
    }
}

// this above approach took 42ms on leetcode.

// code end

// code start

class Solution {
    public int findDuplicate(int[] nums) {
       boolean[] arr = new boolean[nums.length];
        for(int i=0;i<nums.length;i++) {
            if(arr[nums[i]]) return nums[i];
            arr[nums[i]] = true;
        }
        return 0;
    }
}

// this approach took 3ms on leetcode

// here is the explaination

/*Create a boolean array of size n+1 (i.e nums.length)
Loop until nums.length-1
Check if the index position of current element in boolean array is true. (if true, it means the element is already used once hence is the duplicate element)
Else update the corresponding value to true. (indicating the value is used once)
/*

// code end
