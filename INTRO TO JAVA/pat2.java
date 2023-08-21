package pattern;






 /*           * * * *   print this as output
              *     *
              *     *
              * * * *             */
public class pat2 {
    public static void main(String[] args) {

        int row = 4;
        int column = 5;

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (i == 0 || j == 1 || i == row || j == column) {
                    System.out.println("*");
                }
 
            }

        }
    }
}
