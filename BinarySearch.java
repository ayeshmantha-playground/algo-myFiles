void main() {
    int[] nums = {-1, 0, 3, 5, 8, 9, 10, 14};
    System.out.println(binarySearch(nums,0,nums.length-1,3));
}

int binarySearch(int[] nums, int head, int tail, int target) {

    if (head > tail) {
        System.out.println("Number is not available");
        return -1;
    }

    int mid = (head + tail) / 2;

    if (nums[mid] == target) {
        return mid;
    }

    if (nums[head]  == target) {
        return head;
    }

    if (nums[tail]  == target) {
        return tail;
    }

    if (target > nums[mid] ) {
        head = mid + 1;
        return binarySearch(nums, head, tail, target);
    }

    tail = mid - 1;
    return binarySearch(nums, head, tail, target);

}