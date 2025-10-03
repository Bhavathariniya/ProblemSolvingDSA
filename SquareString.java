import java.util.*;

public class SquareString{
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

        // System.out.println(list);

        for(int i=0; i<list.size(); i++){
            String s = list.get(i);
            String s1 = s.substring(0,(s.length())/2);
            String s2 = s.substring((s.length())/2);
            if((s.length())%2 !=0){
                // list.set(i,"NO");
                System.out.println("NO");
            }
            else if(s1.equals(s2)){
                // list.set(i,"YES");
                System.out.println("YES");
            }
            else{
                // list.set(i,"NO");
                System.out.println("NO");

            }
        }

        // System.out.println(list);

        
    }
}