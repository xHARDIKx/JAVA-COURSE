import java.util.Scanner;

public class fabonacci {

    static int fib(int n) {

        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(" which fabonacci number you want to print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
