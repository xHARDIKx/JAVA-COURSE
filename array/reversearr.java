public class reversearr {

    public static void main(String[] args) {

        int arr[] = { 23, 34, 45, 56, 67, 78 }; // array declaration and initialization

        int l = arr.length; // length of array
        int n = Math.floorDiv(l, 2); // floor division
        int temp; // temporary variable

        for (int i = 0; i < n; i++) { // loop for swapping
            // swap a[i] and a[l-i-1]
            //// a b temp
            // 1. |3| |4| || // steps taken place
            // 2. || |4| |3|
            // 3. |4| || |3|
            // 4. |4| |3| ||

            temp = arr[i]; // 2. || |4| |3|
            arr[i] = arr[l - i - 1];// 3. |4| || |3|
            arr[l - i - 1] = temp; // 4. |4| |3| ||
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }

    }

}
