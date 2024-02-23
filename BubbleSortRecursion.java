import java.util.Arrays;

void main(){
    int[] nums = {2, 10, 5, 1, 6, 3, 8, 9};
    sort(nums, 0, nums.length-1);
    System.out.println(Arrays.toString(nums));
}

void sort(int[] nums, int head, int tail) {

    if (tail < head || head > tail-1) {
        return;
    }

    if (nums[head] > nums[head + 1]) {
        int temp = nums[head];
        nums[head] = nums[head + 1];
        nums[head + 1] = temp;

    }

    head++;

    sort(nums,head,tail);
    tail--;
    sort(nums,head,tail);
}