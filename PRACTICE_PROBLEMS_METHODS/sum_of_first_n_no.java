import java.util.Scanner;

public class sum_of_first_n_no {

    // sum(x) = 1+ 2 + 3 + 4 +.. + x-1 + x // 1 to x or 1 to n

    // sum(x) = sum(x-1) + x
    // sum(5) = 1 + 2 + 3 + 4 +5
    // sum(5) = sum(4) + 5
    // sum(4)= sum(3) + 4
    // sum(3) = sum(2) + 3
    // sum(2) = sum(1) + 2
    // sum(1) = 1

    static int sum(int x) {

        if (x == 1) {
            return 1;
        } else {
            return x + sum(x - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number to print the sum of first n numbers: ");
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        System.out.println("The sum of first " + mul + " numbers is: ");
        System.out.println(sum(mul));

    }

}
