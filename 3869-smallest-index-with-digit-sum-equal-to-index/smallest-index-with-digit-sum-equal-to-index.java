class Solution {
    public int smallestIndex(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int digit = nums[i];
            while(digit != 0){
                count += (digit % 10);
                digit /= 10;
            }
            if(count == i) return i;
            count = 0;
        }
        return -1;
    }
}