void main(){
    System.out.println(fib(3));

}

long fib(int n){
    if ((n == 0) || (n == 1))
        return n;
    else return
            fib(n - 1) + fib(n - 2);
}
// This is not optimized version.