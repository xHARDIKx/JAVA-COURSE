import java.util.Scanner;

public class pattern {

    static void pat(int x) {

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i + 1; j++) {

                /*
                 * when
                 * i =0
                 * j =0 j< i+1
                 * j =0 0< 0+1
                 * j=1 1< 0+1 = 1<1 false
                 * 
                 * when
                 * i =1
                 * j =0 j< i+1
                 * j =0 0< 1+1
                 * j=1 1< 1+1 = 1<2 true print one star*
                 * j=2 2< 1+1 2 <2 false
                 * 
                 * when
                 * i =2
                 * j =0 j< i+1
                 * j =0 0< 2+1
                 * j=1 1< 2+1 = 1<3 true print one star*
                 * j=2 2< 2+1 2 <3 true print one star*
                 * j=3 3< 2+1 3< 3 true print one star*
                 * j=4 4< 2+1 4< 3 false
                 * 
                 * 
                 * when
                 * i =3
                 * j =0 j< i+1
                 * j =0 0< 3+1 = 0<4 true print one star*
                 * j=1 1< 3+1 = 1<4 true print one star*
                 * j=2 2< 3+1 2 <4 true print one star*
                 * j=3 3< 3+1 3< 4 true print one star*
                 * j=4 4< 3+1 4< 4 false
                 * 
                 * 
                 * pattern formed is
                 * for n =3
                 * | * `|
                 * | ** |
                 * | ***|
                 * 
                 * 
                 * 
                 * 
                 * 
                 */

                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number to print the pattern: ");
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        pat(mul);
    }
}
