class Solution {
    public boolean checkString(String s) {
        int k = 0;
        while(k < s.length() && s.charAt(k) != 'b'){
            k++;
        }
        if(k != 0 && s.substring(0,k).contains("b")) return false;
        if(s.substring(k, s.length()).contains("a")) return false;
        return true;
    }
}