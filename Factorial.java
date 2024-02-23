void main(){
    int num = 5;
    System.out.println(factorial(num));
}

int factorial(int num){

    if (num == 1) {
        return num;
    }

    return num * factorial(num - 1);
}