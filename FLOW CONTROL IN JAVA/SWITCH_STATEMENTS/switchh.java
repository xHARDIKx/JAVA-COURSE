import java.util.Scanner;

public class switchh {
    public static void main(String ars[]) {
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();

        switch (button) {

            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("byee");
                break;
            default:
                System.out.println("hii");

        }

    }
}
