class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; //Los números negativos no pueden ser palíndromos
        String nums = Integer.toString(x);
        var leftIndex = 0;
        var rightIndex = nums.length() - 1;        
        
        while (leftIndex < rightIndex)
        {
            if (nums.charAt(leftIndex) != nums.charAt(rightIndex))            
            {
                return false;
            }
            else 
            {
                leftIndex++;
                rightIndex--;
            }
        }
        return true;
    }
}
