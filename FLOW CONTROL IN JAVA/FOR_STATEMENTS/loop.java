import java.util.Scanner;

public class loop {
    public static void main(String args[]) {

        System.out.println("enter the number to get table of it");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println((n) + " * " + (i) + " = " + (n * i));
        }

    }

}
