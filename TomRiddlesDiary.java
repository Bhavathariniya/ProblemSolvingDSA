import java.util.*;
public class TomRiddlesDiary{
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

        List<String> list1 = new ArrayList<String>();
        for(String i : list){
            if(!list1.contains(i)){
                list1.add(i);
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }

    }
}