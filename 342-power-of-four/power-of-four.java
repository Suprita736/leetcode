class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0) return false;
        int count = 0,p = 0;
        for(int i = 0;i < 32;i++){
            if(((n >> i) & 1) == 1){
                count++;
                p = 31 - i + 1;
            }
            if(count > 1) return false;
        }
        if(p % 2 != 0) return false;
        return true;
    }
}