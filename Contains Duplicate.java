
//217. Contains Duplicate


//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true

class Solution {
//solution:1
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
         return false;
    }
   

//solution:2 
public boolean containsDuplicate(int[] nums) {
    Set set = new HashSet();
    for(int num : nums) {
    if(!set.add(num)) {
    return true;
    }
    }
    return false;
    }

 //soluiton 3
     public boolean containsDuplicate(int[] nums) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num) > 1) {
            return true;
            }
            }
            return false;
            }
}