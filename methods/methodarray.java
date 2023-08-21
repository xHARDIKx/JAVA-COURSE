public class methodarray {

    static void diff(int a) {

        a = 23;
    }

    static void diff(int array[]) {

        array[0] = 23;
    }

    public static void main(String[] args) {

        int z = 4;
        diff(z);
        System.out.println("after running " + z); // this will print 4 because we are not changing the value of z

        int array[] = { 2, 3, 4, 5, 6 };
        // if reference type is passed in the method then the value of the array will
        // change
        // here reference type is array[] so the value of array will change
        // in array if we change the value of x it will change the value of array[]
        diff(array);
        System.out.println("after running " + array[0]); // this will print 23 because we are changing the value of x

    }

}
