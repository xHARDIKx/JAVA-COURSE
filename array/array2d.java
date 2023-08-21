
public class array2d {

    public static void main(String[] args) {
        // int [] levels ; 1 d array
        int levels[][]; // 2d array
        levels = new int[2][2];

        // we can also write write like
        // int arr[2][2] = {{100,10},{101,11}};

        levels[0][0] = 1001;
        levels[0][1] = 1002;
        levels[1][0] = 1003;
        levels[1][1] = 1004;

        for (int i = 0; i < levels.length; i++) {
            for (int j = 0; j < levels[i].length; j++) {
                System.out.print("*" + levels[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }

}