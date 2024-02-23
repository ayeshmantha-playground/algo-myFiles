void main(){
    int num = 12345;
    System.out.print("[");
    printDigits(num);
    System.out.println("\b\b]");
}

void printDigits(int num){
    if(num == 0) return;

    int power = 1;

//    int temp = num;
//    while (temp != 0) {
//        temp /=  10;
//        power *= 10;
//    }

    while ((num / (power *= 10)) != 0);

    power /= 10;

    System.out.print(STR."\{num / power}, ");
    num %= power;

    printDigits(num);

}