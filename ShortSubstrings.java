import java.util.*;

public class ShortSubstrings{
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

            StringBuilder sb = new StringBuilder("");
            sb.append(s.charAt(0));
            // sb.append(s.charAt(1));

            for(int j=2; j<s.length();j+=2){
                sb.append(s.charAt(j));
            }
            sb.append(s.charAt(s.length()-1));
            System.out.println(sb);
        }
    }
}