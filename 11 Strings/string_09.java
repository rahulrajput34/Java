// Print largest string lexicographically in java
// for this we have properties compareto
// str1.compareTo(str2)
// if the ans is zero than given str1 and str 2 are equal
// if the answer is minus than the str1 is less than str2
// if the answer is plus than the str1 is grater than str2
public class string_09 {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];

        for(int i = 0; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
