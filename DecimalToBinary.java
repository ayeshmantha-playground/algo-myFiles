void main(){
    int decimal = 233;
    System.out.println(decimalToBinary(decimal));

}

String decimalToBinary(int decimal){
    if (decimal == 1) { // Base case / Stopping condition
        return "1";
    }

    if (decimal % 2 == 0) { // divides
        return STR."\{decimalToBinary(decimal / 2)}0";
    }

        return STR."\{decimalToBinary(decimal / 2)}1";
}