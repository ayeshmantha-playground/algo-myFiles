public class Method {
     void main(String[] args) {
         System.out.println("About to enter into something() method");
         int i = doSomething();
         System.out.println();
         System.out.println("Just existed from the doSomething() method");
    }

    int doSomething() {
        System.out.println("Hello");
        System.out.println("IJSE");
        System.out.println("DEP");
        return 10 + 10;
    }
}
