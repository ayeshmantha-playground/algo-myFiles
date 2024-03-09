import java.util.Arrays;

public class VariableAritySample {
    void main(String[] args) {

        int[] array = {10, 20, 50, 40,30,60,90,80};

        myMethod("IJSE", array);
        myMethod("IJSE", 10); // Fixed method not allowed to pass int data for the int []
        myMethod("IJSE"); // It is mandatory to pass all arguments
        //
//        myMethod("IJSE",10,20); // Not allowed to pass multiple values for the int [];
//        myMethod("IJSE",array,10); // Not allowed to pass both array and integer values

        myMethod("IJSE", null);

        System.out.println(array);

    }

//    void myMethod(String someString, int[] array) {
//
//    }
    void myMethod(String someString, int... array) {
        System.out.println(Arrays.toString(array));
    }

}
