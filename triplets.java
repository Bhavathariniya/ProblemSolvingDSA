public class triplets {
    public static void main(String[] args) {
        int[] arr = {-3, -2, -1, 0, 3, 4, 6};
        int count = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int l = i + 1;
            int r = len - 1;

            while (l < r) {
                int val = arr[i] + arr[l] + arr[r];
                if (val == 0) {
                    count++;
                    l++;
                    r--;
                } else if (val < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        System.out.println(count);
    }
}