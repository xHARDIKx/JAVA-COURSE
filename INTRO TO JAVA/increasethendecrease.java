public class increasethendecrease {

    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int k = 1; k <= n; k++) {
            for (int l = 1; l <= n - k + 1; l++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

}
