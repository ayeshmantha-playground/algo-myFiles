import java.util.Arrays;

void main(){
    int[] nums = {6, 4, 9, 5, -2, 3, 8, 0,1};
    System.out.println(Arrays.toString(nums));
    mergeSort(nums,0,nums.length-1);
    System.out.println(Arrays.toString(nums));

}

void mergeSort(int[] nums ,int head, int tail) {
    if (nums.length == 1) return;

    int mid = (head + tail) / 2;

    int[] array1 = new int[mid - head+1];
    int[] array2 = new int[tail  - mid];

    for (int i = 0; i < array1.length; i++)  array1[i] = nums[i];
    for (int i = 0; i < array2.length; i++) array2[i]= nums[array1.length + i];


    mergeSort(array1 ,head,mid);
    mergeSort(array2 , head, nums.length % 2 == 0 ? mid : mid -1);


//    System.out.println(Arrays.toString(array1));
//    System.out.println(Arrays.toString(array2));

    int k=0, m=0;
    int i = 0;
    for (; k < array1.length && m < array2.length; i++) {
        if (array1[k] < array2[m]) {
            nums[i] = array1[k++];
        } else {
            nums[i] = array2[m++];
        }
    }
    for (; k < array1.length; i++) {
        nums[i] = array1[k++];
    }
    for (; m < array2.length; i++) {
        nums[i] = array2[m++];
    }

}

void sort(int[] array1, int[] array2){

}