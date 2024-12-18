fun binaryTreeSearch(nums: IntArray, target: Int): Int {
    var left = 0;
    var right = nums.size - 1;
    while(left <= right) {
        val pivot : Int = (left+right) / 2;
        if (nums[pivot] == target) {
            return pivot;
        } else if (nums[pivot] < target) {
            right = pivot - 1;
        } else {
            left = pivot + 1;
        }
    }
    return -1;
}