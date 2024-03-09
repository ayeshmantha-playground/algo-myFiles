import java.util.Arrays;

void main(){
    int[] nums = {10, 2, -2, 5, 7, 19};
    System.out.println(Arrays.toString(nums));
    sort(nums);
    System.out.println(Arrays.toString(nums));
}

void sort(int[] nums) {
    for (int i = 0; i < nums.length -1; i++) {
        // selection
        int value = nums[i + 1];

        // Optimization
        if (nums[i] < value) {
            continue;
        }
        int insertionIndex = i; // what is the reason equal to i
        for (int j = 0; j < nums[i]; j++) {
            if (value < nums[j]) {
                insertionIndex = j;
                break; // to stop loop after find the first value greater than the value variable
            }
        }

        //shifting
        for (int k = i+1; k > insertionIndex ; k--) {
            nums[k] = nums[k - 1];
        }
        // replace
        nums[insertionIndex] = value;
    }
}