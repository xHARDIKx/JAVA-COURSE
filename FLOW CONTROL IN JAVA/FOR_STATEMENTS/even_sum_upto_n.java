import java.util.Scanner;

public class even_sum_upto_n {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner sc=new Scanner(System.in); for odd sum

        int n = sc.nextInt(); // int n=sc.nextInt(); for odd sum
        int sum = 0; // int sum=0; for odd sum

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) { // if(i%2!=0) for odd sum
                sum = sum + i; // sum=sum+i; for odd sum

                System.out.println(sum); // System.out.println(sum);

            }

        }
    }

}
