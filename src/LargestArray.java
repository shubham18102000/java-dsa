public class LargestArray {

    int largestwas() {
        int[] arr = {1, 3, 2, 6, 4, 7, 10, 9};

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        return largest;
    }
}


