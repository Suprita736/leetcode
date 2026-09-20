class Solution {
    public int reverseDegree(String s) {
        int sum = 0, i = 0;
        while(i < s.length()){
            sum += (('z' - s.charAt(i) + 1) * (i + 1));
            i++;
        }
        return sum;
    }
}