import java.io.*;
import java.util.*;

public class day29 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t--!=0)
        {
            int max=0;
            int a=in.nextInt(),k=in.nextInt();
            for(int i=1;i<=a;i++)
            {
                for(int j=i+1;j<=a;j++)
                {
                    //System.out.println(i+" "+j+" "+(i&j));
                    if((i&j)<k)
                        max=Math.max(i&j,max);
                }
            }
            System.out.println(max);
        }
    }
}