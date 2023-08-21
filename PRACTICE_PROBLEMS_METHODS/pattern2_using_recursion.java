public class pattern2_using_recursion {

    static int pat(int n) {

        if (n > 0) { // base case is n=0 when n=0 it will return 0 and the recursion will stop
            pat(n - 1); // this is the recursive case
                        // if n=4 then it will call pat(3) then pat(2) then pat(1) then pat(0) then it
                        // will return 0 and the recursion will stop
            // first it will print 4 stars then 3 stars then 2 stars then 1 star then 0 star
            // how it will print stars

            for (int i = 0; i < n; i++) {
                // when n=4 i=0 i<4 true print one star*
                // i=1 1<4 true print one star*
                // i=2 2<4 true print one star*
                // i=3 3<4 true print one star*
                // i=4 4<4 false

                // when n=3 i=0 i<3 true print one star*
                // i=1 1<3 true print one star*
                // i=2 2<3 true print one star*
                // i=3 3<3 false

                // when n=2 i=0 i<2 true print one star*
                // i=1 1<2 true print one star*
                // i=2 2<2 false

                // when n=1 i=0 i<1 true print one star*
                // i=1 1<1 false

                // when n=0 i=0 i<0 false

                // pattern formed is
                // ****
                // ***
                // **
                // *

                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {

        pat(4);

    }
}