public class pattern2 {

    static int pat(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                // when
                // i =0
                // j =0 j< n- i
                // j =0 0< 4-0 true print one star*
                // j=1 1< 4-0 = 1<4 true print one star*
                // j=2 2< 4-0 2 <4 true print one star*
                // j=3 3< 4-0 3< 4 true print one star*
                // j=4 4< 4-0 4< 4 false

                // when
                // i =1
                // j =0 j< n- i
                // j =0 0< 4-1
                // j=1 1< 4-1 = 1<3 true print one star*
                // j=2 2< 4-1 2 <3 true print one star*
                // j=3 3< 4-1 3< 3 true print one star*
                // j=4 4< 4-1 4< 3 false

                // when
                // i =2
                // j =0 j< n- i
                // j =0 0< 4-2
                // j=1 1< 4-2 = 1<2 true print one star*
                // j=2 2< 4-2 2 <2 false
                // j=3 3< 4-2 3< 2 false
                // j=4 4< 4-2 4< 2 false

                // when
                // i =3
                // j =0 j< n- i
                // j =0 0< 4-3 = 0<1 true print one star*
                // j=1 1< 4-3 = 1<1 false
                // j=2 2< 4-3 2 <1 false

                // pattern formed is
                // ****
                // ***
                // **
                // *

                System.out.print("*");
            }
            System.out.println();
        }
        return n;

    }

    public static void main(String[] args) {

        System.out.println(pat(4));
    }

}
