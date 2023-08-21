import java.util.Scanner;

public class patt4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();

        for (int i = in; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }

}
