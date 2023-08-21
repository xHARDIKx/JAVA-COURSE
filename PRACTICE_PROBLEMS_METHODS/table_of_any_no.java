import java.util.Scanner;

public class table_of_any_no {

    static void table(int x) {

        for (int i = 1; i <= 10; i++) { // for loop is used to print the table

            System.out.format(" %d X %d = %d\n", x, i, x * i);
            // format is used to print the table in a proper format
        } // %d is used to print the integer value
          // \n is used to print the table in a new line
          // %d X %d = %d is used to print the table in a proper format
    }

    public static void main(String[] args) {
        System.out.println("Enter the number to print the table: ");

        Scanner sc = new Scanner(System.in); // Scanner class is used to take input from the user
        int mul = sc.nextInt(); // nextInt() is used to take integer input from the user

        table(mul);
    }

}
