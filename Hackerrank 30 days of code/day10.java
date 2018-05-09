import java.io.*;
import java.util.*;

public class day10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String s=Integer.toString(in.nextInt(),2);
        int ans=0,localcount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                localcount+=1;
            else
            {
                ans=(ans>localcount)?ans:localcount;
                localcount=0;
            }    
        }
        System.out.println((ans>localcount)?ans:localcount);
    }
}