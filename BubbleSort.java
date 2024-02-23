import java.util.Arrays;

void main() {
    int[] nums = {10, 2, -3, 3, -1, 2};
//    sortViaMax(nums);
    sortViaMin(nums);
    System.out.println(Arrays.toString(nums));


}

void sortViaMax(int[] nums) {

    for (int j = 0; j < nums.length-1; j++) {
        for (int i = 0; i < nums.length - 1 -j; i++) { // add this part ot enhance the performance
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }

    }
}

void sortViaMin(int [] nums){

    for (int j = nums.length-1; j > 0 ; j--) {
        for (int i = nums.length - 1; i > (nums.length - j-1); i--) { // add this part to enhance the performance
            if (nums[i] < nums[i-1]) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
        }
    }


}