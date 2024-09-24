// what is call by value and call by reference

// call by value means when we call the functions and provide that a variv=able that time it not take original variables, intread it would take copy of the given varibale.
//In java we provide the value than it is going to provide a value by -- call by value


// call by reference means it takes original values when we call a function.
//in some programming language this is going to work.


// Example of call by value
public class functions_04 {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swaped value of a is " + a);
        System.out.println("Swaped value of b is " + b);
        
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b); // this is going to print swaping value of a and b

        System.out.println(a);
        System.out.println(b);
        // this is going to print original value of a and b

    }
}
// it simply mean  that java was not giving it's original valriable to the function swap it provide the copy of that. that is why we got different.
