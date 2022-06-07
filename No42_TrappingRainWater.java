// height = [0,1,0,2,1,0,1,3,2,1,2,1]

class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int i = 0;
        int j = height.length - 1;
        
        int trappedWater = 0;
        while(i < j) {
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);
            if(leftMax < rightMax) {
                trappedWater += leftMax - height[i];
                i++;
            }
            else {
                trappedWater += rightMax - height[j];
                j--;
            }   
        }
        return trappedWater;
    }
}

// require to write `Math` when using max or min
