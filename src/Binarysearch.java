public class Binarysearch {
    int binaryseach(int key)
    {
        int[] arr = { 1,3, 5, 6, 7, 8, 9, 10 , 12};

        int low = 0;
        int high = arr.length-1;

        while (low <= high)
        {
            int mid = (low + high)/2;

            if(arr[mid] == key)
            {
                return mid;
            }
            else if( arr[mid] < key)
            {
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }

        return -1;


    }
}
