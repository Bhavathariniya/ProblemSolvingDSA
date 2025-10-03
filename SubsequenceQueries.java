import java.util.*;

public class SubsequenceQueries {
    
    public static boolean isSubsequence(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s1.length();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        for (int q = 0; q < Q; q++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            String s1 = arr[x - 1];
            String s2 = arr[y - 1];

            if (isSubsequence(s1, s2) || isSubsequence(s2, s1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
