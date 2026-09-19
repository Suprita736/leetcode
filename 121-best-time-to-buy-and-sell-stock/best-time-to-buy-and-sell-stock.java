class Solution {
    public int maxProfit(int[] p) {
        int max = Integer.MIN_VALUE;
        int i = 0,j = i+1;
        while(i < p.length && j < p.length){
            if(p[j] < p[i]) {
                i = j;
                j = i+1;
            }
            else {
                max = Math.max(max, p[j] - p[i]);
                j++;
            }
        }
        if(max == Integer.MIN_VALUE) return 0;
        return max;
    }
}