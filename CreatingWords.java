import java.util.*;

public class CreatingWords{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<String>();

        while(val > 0){
            String str = sc.nextLine();
            list.add(str);
            val--;
        }

        for(int i=0; i<list.size(); i++){
            String s = list.get(i);

            StringBuilder sb = new StringBuilder(s);

            sb.setCharAt(0,s.charAt(4));
            sb.setCharAt(4,s.charAt(0));

            System.out.println(sb);
        }
    }
} 