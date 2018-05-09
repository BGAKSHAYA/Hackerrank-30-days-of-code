import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
		// Add your code here
    Difference(int[] element)
    {
        this.elements=element.clone();
    }
    void computeDifference()
    {
        for(int i=0;i<this.elements.length;i++) 
            this.elements[i]=Math.abs(this.elements[i]);
        Arrays.sort(this.elements);
        maximumDifference=this.elements[this.elements.length-1]-this.elements[0];
        
    }
	} // End of Difference class

public class day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}