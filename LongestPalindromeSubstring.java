/*In LeetCode I used class name is given default as Solution. I'm changing it to LongestPalindromeSubstring to match file name*/

class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
        String m ="";
        int longest = 0;
        for(int i=0;i<s.length();i++){
            int left =i;
            int right = i;
            while(left>=0 && right<s.length() && s.charAt(left)== s.charAt(right)){
                if(right-left +1 > longest){
                    longest = right-left+1;
                    m = s.substring(left,right+1);
                }
                left--;
                right++;
            }
            left = i;
            right = i+1;
                while(left>=0 && right<s.length() && s.charAt(left)== s.charAt(right)){
                if(right-left +1 > longest){
                    longest = right-left+1;
                    m = s.substring(left,right+1);
                }
                left--;
                right++;
            }
        }
        return m;
    }
}
