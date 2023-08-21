public class sorted {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        boolean issorted = true;
        for (int i = 0; i < arr.length - 1; i++) { // here we are using arr.length-1 because we are comparing the last
                                                   // element with the second last element
            // otherwise it will give array index out of bound exception

            if (arr[i] > arr[i + 1]) {
                issorted = false;
                break;

            }

        }
        if (issorted) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }
    }

}
