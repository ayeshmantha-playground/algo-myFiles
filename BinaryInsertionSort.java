import java.util.Arrays;

void main(){
    int[] numbers = {1, 5, 2, 9, 0, -1, 3, 6};
    binaryInsertionSort(numbers);
    System.out.println(Arrays.toString(numbers));
}

void binaryInsertionSort(int [] nums){

    for (int i = 0; i < nums.length-1; i++) {
        int min = nums[i];
        int value = nums[i + 1];
        int insertionIndex = i;

        if (min < value) {
            continue;
        }

        insertionIndex =  binarySearch(nums, 0, i-1 , value);

        for (int k = i + 1; k > insertionIndex; k--) {
            nums[k] = nums[k-1];
        }

        nums[insertionIndex] = value;

    }
}

static int binarySearch(int [] nums , int head, int tail, int target) {
    if (head <= tail) {
        int mid = (head + tail)/ 2;

        if (nums[mid] > target) {
            return binarySearch(nums, head, mid - 1, target);
        }

        return binarySearch(nums, mid + 1, tail, target);
    }
    return head;
}