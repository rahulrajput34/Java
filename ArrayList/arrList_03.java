import java.util.ArrayList;

public class arrList_03 {
    public static void main(String[] args) {
        // just like .lenght in array
        //  we have size() for ArrayList

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // System.out.println(list.size());

        // print arrayList

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
}
