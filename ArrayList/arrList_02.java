// Operation in array List
import java.util.ArrayList;

public class arrList_02 {
    public static void main(String[] args) {
        ArrayList <Integer> list  = new ArrayList<>();
       
        // Adding value to the array List
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // 
        list.add(1, 9);  // adding 0 at one and index element goes to index and and two goes to three and so on
        System.out.println();

        // Get Opration
        System.out.println(list.get(0));

        // Remove element
        list.remove(2);
        System.out.println(list);

        // Set element at index
        // remove previsous one and add new one

        list.set(2, 20);
        System.out.println(list);

        // Contains element 
        System.out.println(list.contains(20));
        System.out.println(list.contains(10)); 

        // Most of properties of Array and Arraylist are same
    }
}
