// we we write a second value then variable follow call by value whereas, array follow call by reference
// is means that if we update a given array in other fuanction so it will change main fucntion as well.

public class arrays_03 {
    public static void array(int marks[], int a) {
        a = 10; // call by value

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // call by reference
        }
    }

    public static void main(String[] args) {
        int a = 12;
        int marks[] = { 99, 98, 98, 97 };

        array(marks, a); // change original one that is why call by refernece

        System.out.println(a);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
