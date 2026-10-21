class Solution {
    public int singleNumber(int[] nums) {
        int r = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i]) < 3){
                r = r ^ nums[i];
            }
        }
        return r;
    }
}