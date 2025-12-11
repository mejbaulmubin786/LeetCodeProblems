class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] newArray = new int[nums.length];
        // Squaring each element
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i] * nums[i];
        }
        
        // Sorting the array of squared numbers
        Arrays.sort(newArray);
        
        return newArray;
    }
}