// // Question: find the largest and smalled for array
// public class arrays_05 {
//     public static int largestNum(int number[]){
//         int largest = Integer.MIN_VALUE; // minus infinity -- lowest possible value
//         int smallest = Integer.MAX_VALUE; // plus infinity -- highest possible value
//         for (int i = 0; i < number.length; i++) {
//             if(largest < number[i]){
//                 largest = number[i];
//             }
//             if(smallest > number[i]){
//                 smallest = number[i];
//             }
//         }
//         System.out.println("smallest value is: " + smallest);
//         return largest;
//     }
//     public static void main(String[] args) {
//         int number[] = {1, 3, 432, 54, 56443, 5654, 22, 43, 543233};
//         for(int num: number){
//             System.out.println(num);
//         }
        
//         System.err.println("The largest value is: " + largestNum(number));
//     }
// }

class Class1{
    private int x;

    public Class1(int x){
        this.x = x;
    }
    public int getX(){
        return this.x;
    }

    public static void main(String[] args) {
        Class1[] a = new Class1[11];
        for (int index = 1; index < a.length; index++) {
            a[index] = new Class1(index);
             System.out.println(a[index].getX());

        }

    }
}
