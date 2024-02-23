import java.util.Arrays;

void main(){
    System.out.println(Arrays.toString(checkTwoSum(1225, 7)));       // [2,5]
    System.out.println(Arrays.toString(checkTwoSum(2508, 10)));      // [2,8]
}

int [] checkTwoSum(int number, int target) {
    int count = 1;

    int temp = number;
    while ((temp/=10) != 0) count++;

    int[] numsArray = new int[count];

    while (--count >= 0) {
        numsArray[count] = number % 10;
        number /= 10;
    }

    for (int i = 0; i < numsArray.length; i++) {
        for (int j = i + 1; j < numsArray.length; j++) {
            if (numsArray[i] + numsArray[j] == target) {
                return new int[]{numsArray[i], numsArray[j]};
            }
        }
    }

    return null;
}