import java.util.Arrays;

void main(){
    int[] nums = {10, 23, 5, 3, 9, -1, 4,8};
    reverseArray(nums, 0, nums.length - 1);
    System.out.println(Arrays.toString(nums));
}

void reverseArray(int[] num, int head, int tail) {

    if (head > tail) {
        return;
    }

    int temp = num[head];
    num[head] = num[tail];
    num[tail] = temp;

    head++;
    tail--;
    reverseArray(num, head, tail);
}