//the code you provided will result in an infinite loop. This is because the num variable is never incremented inside the while loop when num is equal to 5. The continue statement causes the program to skip the rest of the loop body and go back to the loop condition, but since num remains 5, the loop will continue indefinitely without making progress.
// why we have to do below
public class loops_14 {
    public static void main(String[] args) {
        int num = 0;
        while (num < 10) {
            if (num == 5) {
                num++; // Increment num when it's 5
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
