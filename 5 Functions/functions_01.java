// we have to give data type when we create a function.
// function and methods are same in java because all function we write in java inside the class.
// when we give data type aother than void that time we have to return the value in given datatypes.
//

public class functions_01 {
    // void means none
    public static void printHelloWorld(){   // we have to give data type 
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return; // becausee void return nothing
    }
    public static void main(String[] args) {
        printHelloWorld();  // function call
    }
}