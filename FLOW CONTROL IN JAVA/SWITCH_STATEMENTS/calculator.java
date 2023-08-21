import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {

        System.out.println(
                " *******PRESS******** \n 1 for addition\n 2 for subtraction\n 3 for multiplication\n 4 for division\n 5 for modulus\n  ******PRESS*******");
        Scanner sc = new Scanner(System.in);
        Float button = sc.nextFloat();

        if (button > 5) {
            System.out.println("invalid input");
        }
        System.out.println("enter two numbers");
        Float a = sc.nextFloat();
        Float b = sc.nextFloat();

        switch (button.intValue()) {

            case 1:

                System.out.println((a + b));
                break;
            case 2:

                System.out.println((a - b));
                break;
            case 3:
                System.out.println((a * b));
                break;
            case 4:
                System.out.println((a / b));
                break;
            case 5:
                System.out.println((a % b));
                break;

        }

    }
}
