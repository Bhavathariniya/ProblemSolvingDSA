import java.util.*;

public class LoveStory{
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

        String str = "codeforces";

        for(int i=0; i<list.size(); i++){
            int count =0;
            String s = list.get(i);
            for(int j=0; j<s.length(); j++){
                if(!(s.charAt(j) == str.charAt(j))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}