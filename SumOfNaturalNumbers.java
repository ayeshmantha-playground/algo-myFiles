void main(){
    int sumTo = 3;
    System.out.println(sumOfNaturalNumbers(sumTo));
}

int sumOfNaturalNumbers(int num){ // base case / stopping case

    if (num == 1) {
        return 1;
    }

    return sumOfNaturalNumbers(num-1) + num ;// divides

}