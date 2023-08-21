
import java.util.Scanner;

public class countno {

    public static void main(String[] args) {

        // explaination: 34343%10=3, 34343/10=3434, 3434%10=4, 3434/10=343, 343%10=3,
        // 343/10=34, 34%10=4, 34/10=3, 3%10=3, 3/10=0

        int count = 0;
        // count no. of digits in a number
        // check no. of 4 in a number by taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int n = sc.nextInt();
        System.out.println("enter digit to be checked");
        int rem = sc.nextInt();

        while (n > 0) {

            int last_digit = n % 10; // explaination: 34343%10=3, 34343/10=3434, 3434%10=4, 3434/10=343, 343%10=3,
                                     // 343/10=34, 34%10=4, 34/10=3, 3%10=3, 3/10=0
            if (last_digit == rem) { // if last digit is equal to the digit to be checked then count is incremented
                                     // by 1
                count++; // count=count+1 or count+=1 or count++
            }
            n = n / 10; // n=n/10 or n/=10
        }
        System.out.println("the number of times the digit is repeated  is " + count);

    }
}