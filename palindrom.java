import java.util.*;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            boolean sts = false;
            for (int i = 0; i < s.length()/2; i++) {
                if (s.charAt(i) == s.charAt((s.length()-1)-i)) {
                    sts = true;
                }
                else{
                    sts = false;
                    break;
                }
            }
            
            if (sts) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
