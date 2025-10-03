public class twopointer {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 2, 1, 2, 0};

        int len = arr.length;
        int low = 0;
        int mid = 0;
        int high = len - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            } else {
                mid++;
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]);
        }
    }
}