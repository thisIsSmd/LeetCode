class Solution {
    public boolean isPalindrome(int x) {
        
        String p = String.valueOf(x);
        int count = 0;

        for (int i = 0, j = p.length()-1; i < p.length(); i++, j--)
        {
            if(p.charAt(i) == p.charAt(j))
                count++;
        }

        if(count == p.length())
            return true;
        else
            return false;
    }
}
