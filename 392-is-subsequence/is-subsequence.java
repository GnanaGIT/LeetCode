class Solution {
    public boolean isSubsequence(String ss, String tt) {
        int sp =0, tp =0;
        char s[] = ss.toCharArray();
        char t[] = tt.toCharArray();
        while(sp<s.length && tp<t.length){
            if(s[sp]==t[tp]){
                sp++;
            }
            tp++;
        }
        return sp == s.length;
    }
}