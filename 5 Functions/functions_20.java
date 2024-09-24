// Question 1
public class functions_20 {
    public static int avgOfThreeNum(int num1, int num2, int num3) {
        int avg = (num1 + num2 + num3) / 3;
        return avg;
    }

    public static void main(String[] args) {
        int avg = avgOfThreeNum(12, 14, 16);
        System.out.println(avg);
    }
}
