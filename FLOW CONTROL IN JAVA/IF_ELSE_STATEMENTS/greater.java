import java.util.Scanner;

public class greater {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b) {
            System.out.println(" a  equal b");
        } else if (b == c) {

            System.out.println("b equal c ");
        } else if (b > c) {

            System.out.println(" b greater than c ");
        } else if (c > a) {
            System.out.println(" c lesser than a ");

        }
    }
}