class Solution {
    public int scoreOfString(String s) {
        int l=s.length();
        int k = 0;
        for(int i=0;i<l-1;i++)
        {
            k += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return k;
        
    }
}
