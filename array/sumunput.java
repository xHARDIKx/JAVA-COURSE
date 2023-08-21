import java.util.Scanner;

public class sumunput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6]; // how to take input from user in array
        // int arr[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        System.out.println("enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];

        }
        System.out.println("sum of array is " + sum);
    }
}
