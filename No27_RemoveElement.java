class Solution {
    public int removeElement(int[] nums, int numToRemove) {        
        int sortedEndIndex = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == numToRemove)
            {
                continue;    
            }
            
            if(i != sortedEndIndex)
            {
                swap(nums, sortedEndIndex, i);
            }
            sortedEndIndex++;
        }
        return sortedEndIndex;
    }
    
    public void swap(int[] nums, int index1, int index2)
    {
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }
}

/*
Note:
1. Is there a good way for Java to do swap?
    Ans: Nope
2. Memorize what's the length method for array and list    
*/
