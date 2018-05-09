import java.io.*;
import java.util.*;

public class day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int testcases=in.nextInt();
        in.nextLine();
        for(int t=0;t<testcases;t++)
        {
            String line=in.nextLine();
            String even="",odd="";

            for(int i=0;i<line.length();i++)
            {
                if(i%2==0) even+=line.charAt(i);
                else odd+=line.charAt(i);
            }
            System.out.println(even+" "+odd);  
        }
    }
}