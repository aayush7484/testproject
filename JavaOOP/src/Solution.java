import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = 0;
        s=s.trim();
        String delims ="[ .,?!]+";
        String[] str = s.split(delims);
        if(str!=null) {
        for(String i:str) {
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

