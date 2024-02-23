import java.util.Arrays;

void main(){
    int[] nums = {10, 2, 5, -2, 4, 19};
    int[] nums1 = {3, 2, 5, -3, 0, 1};
    sortViaMin(nums);
    sortViaMin(nums1);
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(nums1));
    sortViaMax(nums);
    sortViaMax(nums1);
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(nums1));
}

void sortViaMin(int [] nums){
    for (int i = 0; i < nums.length; i++) {
        int minIndex = i; // This is a necessary
        int min = nums[minIndex];

        for (int j = i+1; j <nums.length ; j++) {

            if (nums[j] < min) {
                minIndex = j;
                min = nums[minIndex];
            }

        }

        if(i == minIndex) continue;

        int temp = nums[i];
        nums[i] = min;
        nums[minIndex] = temp;
    }
}

void sortViaMax (int [] nums){

    for (int i = nums.length-1; i >= 0; i--) {
        int maxIndex = i; // This is a must
        int max = nums[maxIndex];

        for (int j = i -1; j >= 0; j--) {
            max = max < nums[j] ? nums[j] : max;
            if (max == nums[j]) {
                maxIndex = j;
            }
        }

        if (i == maxIndex) {
            continue;
        }

        int temp = nums[i];
        nums[i] = nums[maxIndex];
        nums[maxIndex] = temp;

    }

}