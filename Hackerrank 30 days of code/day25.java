import java.io.*;
import java.util.*;

public class day25 {
    static int prime(int n)
    {
        if(n==1) return 0;
        if(n==2) return 1;
        for(int i=2;i*i<=n;i++)
        {
                if(n%i==0) 
                    return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t--!=0)
        {
            int n=in.nextInt();
            int p=prime(n);
            if(p==1) 
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}