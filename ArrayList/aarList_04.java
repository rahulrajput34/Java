// Q1: Reverse of Array List
import java.util.ArrayList;
public class aarList_04 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = list.size(); i > 0; i--) {
            System.out.println(i);
        }
    }
}
