// Binary left shift ( << )
// if the number is 0001010 then  0001010 << 2 means two digits from the front are going to remove and then number become 0101000 , we removed two digits from the first that is why we are going to add two zero at the and because the number of digit you have removed you have to add that number of zeros at the end.


public class bit_manuplation_06 {
    public static void main(String[] args) {
        System.out.println(5<<2);

        // because 5 == 000101
        // two digit from the fron removed so it became 0101
        // now how many digits you have removed that times you have to adds zeros at the end
        // so that the  number became 010100
        // the value of 010100 is 20 that is why the answer is going to be 20
        
    }
}
