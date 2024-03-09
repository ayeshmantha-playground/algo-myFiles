import javax.management.ObjectName;

public class ArraySample {
    public static void main(String[] args) {

        String str1 = "ijse";
        String str2 = "ijse";

//        char [] array1 = {'i', 'j', 's', 'e'};
//        char [] array2 = {'i', 'j', 's', 'e'};
//
//        String str3 = new String("ijse");
//        String str4 = new String("ijse");

//        System.out.println(STR."using == for str1 and str2 || \{str1 == str2}");
//        System.out.println(STR."using .equal() str1 and str2 || \{str1.equals(str2)}\n");

//        System.out.println(STR."using == for str3 and str4 || \{array1 == array2}");
//        System.out.println(STR."using .equals() for str3 and str4 || \{array1.equals(array2)}\n");
//
//        System.out.println(STR."using == for str3 and str4 || \{str3 == str4}");
//        System.out.println(STR."using .equals() for str3 and str4 || \{str4.equals(str3)}");

        int[] nums = {10, 20, 30, 40};
        System.out.println(nums.hashCode());
        System.out.println(nums.toString());

        String str = nums + "";
        System.out.println(str);

    }

}
