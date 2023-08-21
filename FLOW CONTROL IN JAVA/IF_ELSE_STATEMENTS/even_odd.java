import java.util.Scanner;

public class even_odd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. to check if it is either even or odd");
        int no = sc.nextInt();

        if (no % 2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }

    }
}
