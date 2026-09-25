class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int max = Integer.MIN_VALUE,num = 0;
        for(int i = 0;i < nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) +1);
            if(mp.get(nums[i]) > max){
                max = mp.get(nums[i]);
                num = nums[i];
            }
        }
        return num;
    }
}