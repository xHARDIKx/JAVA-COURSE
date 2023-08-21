
public class add {

    public static void main(String[] args) {
        //
        // 1 2 3
        // 4 5 6

        int matrix1[][] = { { 1, 2, 3 },
                { 4, 5, 6 } };

        int matrix2[][] = { { 2, 3, 4 },
                { 5, 6, 7 } };
        int resultant[][] = { { 0, 0, 0 },
                { 0, 0, 0 } };
        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.format("setting value for i=%d and j=%d\n", i, j);
                resultant[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(resultant[i][j] + "   ");
                resultant[i][j] = matrix1[i][j] + matrix2[i][j];

            }
            System.out.println();
        }
    }

}
