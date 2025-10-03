
import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        // float b = sc.nextFloat();
        // double c = sc.nextDouble();
        sc.nextLine();
        String d = sc.nextLine();
        
        System.out.printf("a : %d", a);
        // System.out.printf("b : %.2f", b);
        // System.out.printf("c : %.2f", c);
        System.out.printf("d : %s", d);
        
        
       
        
        System.out.printf("a : %d \n B : %s ", a, d);
        
    }
}


public class Main {
    public static void main(String[] args) {
        
        String s = "Hello";
        
        StringBuilder sb = new StringBuilder(s);
        
        sb.insert(0,"hi ");
        int num = 87;
        String b = Integer.toString(num);
        char a[] = s.toCharArray();
        System.out.println(a[1]);
        System.out.println(b);
        
    }
}