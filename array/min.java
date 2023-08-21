import java.util.Scanner;

public class min {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int array[] = new int[5];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {

            array[i] = sc.nextInt();
            if (array[i] < min) {
                min = array[i];
                System.out.println("minimum value is " + min);

            } else {
                continue;

            }

        }
    }

}
