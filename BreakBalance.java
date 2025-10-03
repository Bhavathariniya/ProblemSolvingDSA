
import java.util.*;
import java.io.*;

class BreakBalance{

        public static int FindBalance(char arr[]){

        Stack <Character> s = new Stack<>();

        int flag = 1;

        for(char i : arr){
            if(i == '('){
                s.push('(');
            }
            else if(i == ')' && !s.isEmpty()){
                s.pop();
            }
            else if(s.isEmpty() && i == ')'){
                flag =0;
                break;
            }
        }

        if(s.isEmpty() && flag == 1){
            return 1;
        }
        else{
            return 0;
        }

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();

        char[] arr = b.toCharArray();


        int res = FindBalance(arr);

        System.out.println(res);
    }


}