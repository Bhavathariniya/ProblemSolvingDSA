import java.util.*;

public class DigitMinimization{
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

        for(String i : list)
            if(i.length() == 2){
                System.out.println(i.charAt(1));
            }
            else{
                char [] arr = i.toCharArray();
                Arrays.sort(arr);
                System.out.println(arr[0]);
            }
        }

    

}