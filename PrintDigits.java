import java.util.Arrays;

void main(){
    int num = 13689325;
    printDigits1(num);
}


//using String API
//void printsDigits(int num){
//    System.out.println(Arrays.toString(String.valueOf(num).toCharArray()));
//
//}

//without using String API
void printDigits1(int num){

    int power = 1;
    int count = 0;

    while ((num / (power *= 10)) != 0) count++;

    power /= 10;

    System.out.print("[");
    while (count-- >= 0) {
        System.out.print(STR."\{num / power}, ");
        num %= power;
        power /= 10;
    }
    System.out.print("\b\b]");
}