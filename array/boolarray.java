import java.util.Scanner;

public class boolarray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = { 3, 45, 6, 7, 8, 9, 90 };
        System.out.println("write the no. to be checked");
        int num = sc.nextInt();

        boolean isArrray = false;

        for (int elements : marks) {
            if (num == elements) {
                isArrray = true;
                break;
            }
        }
        if (isArrray) {
            System.out.println("the no is present in array");
        } else
            System.out.println("not present");
    }
}
