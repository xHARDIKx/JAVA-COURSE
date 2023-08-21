import java.util.Scanner;

public class marks {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to enter marks *** enter 0 to exit");

        int n = sc.nextInt();
        do {

            System.out.println("enter marks");
            int mark = sc.nextInt();
            if (mark > 90) {
                System.out.println("This is good");

            } else if (89 >= mark && 60 <= mark) {
                System.out.println("this is good as well");

            } else {
                System.out.println("this is good as welll");

            }
            System.out.println();

        } while (n == 1);

    }

}
