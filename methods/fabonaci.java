import java.util.Scanner;

public class fabonaci {

    static int fabonaci(int n) {

        // a =0 fn-2
        // b = 1 fn-1 c = b + a
        // 1 = 1 + 0 = 1
        // c = 1 fn Fn = Fn-1 + Fn-2

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
            // Base cases return itself 0 and 1
        } else {
            // show the no. of fabonaci series

            return fabonaci(n - 1) + fabonaci(n - 2);

        }

    }

    public static void main(String[] args) {
        System.out.println("enter the no. to find fabonaci");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("fabonaci of givn no. is " + fabonaci(a));

    }

}
