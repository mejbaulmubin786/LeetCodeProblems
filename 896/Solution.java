class Solution {
    public boolean isMonotonic(int[] array) {
        if (array.length == 0) {
            return true;
        }
    int first = array[0];
    int last = array[array.length - 1];
        // 1.......10
        if (first == last) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] != array[i]) return false;
            }
        }
        else if (first < last) {
            // non decreasing
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) return false;
            }
        }
        else {
            // non increasing
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] > array[i]) return false;
            }
        }
        return true;
    }
}