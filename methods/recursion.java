import java.util.Scanner;

public class recursion {

    static int factorial(int x) { // 5

        if (x == 0 || x == 1) { // 5 == 0 || 5 == 1
            return 1;
        } else {

            return (x * factorial(x - 1)); // 5 * 4 * 3 * 2 * 1

        }

    }

    public static void main(String[] args) {
        System.out.println("enter the no. to find factorial");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if (no > 33) {
            System.out.println("factorial is out of range");

        } else if (no < 0) {
            System.out.println("factorial is not possible");

        } else
            System.out.println("factorial of givn no. is " + factorial(no));

    }
}
