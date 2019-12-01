import java.io.*;
import java.util.*;

public class solution1 {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = 0;
        s=s.trim();
        System.out.println(s);
        String delims ="[ .,?!]+";
        String[] str = s.split(delims);
        
        if(str!=null) {
        for(String i:str) {
        	System.out.println(str);
        	System.out.println(n);
        	n++;
        }
        }
        System.out.println(n);
        for(String i: str)
        {
        	System.out.println(i);
        }
        

        sc.close();
    }
}
