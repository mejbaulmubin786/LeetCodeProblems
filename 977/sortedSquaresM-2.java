class Solution {
    public int[] sortedSquares(int[] array) {
        int[] newArray = new int[array.length];
        int pointerLeft =0;
        int pointerRight = array.length-1;
    for(int i=array.length-1; i>=0; i--){
        int leftSquared = array[pointerLeft] * array[pointerLeft];
        int rightSquared = array[pointerRight] * array[pointerRight];
        if(leftSquared>rightSquared){
            newArray[i]=leftSquared;
            pointerLeft++;
        } else{
            newArray[i]=rightSquared;
            pointerRight--;
        }
    }
    return newArray;
}
}