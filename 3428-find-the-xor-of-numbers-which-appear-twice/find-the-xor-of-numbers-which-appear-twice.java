class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int r = 0;
        for(int i = 0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if(entry.getValue().equals(2)){
                r = r ^ entry.getKey();
            }
            // if (entry.getKey().equals("Apple")) {
            //     entry.setValue(entry.getValue() + 5); // Safely update value
            // }
        }
        return r;
    }
}