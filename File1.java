
// Factorial Using recursion
void main(){

    System.out.println(factorial(3));
}

int factorial(int x){
    if(x==1){
        return 1;
    }
    return (x * factorial(--x));
}