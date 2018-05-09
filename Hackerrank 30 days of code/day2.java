import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        long ans=Math.round(meal_cost+(tip_percent*0.01*meal_cost)+(tax_percent*0.01*meal_cost));
        System.out.println("The total meal cost is "+ans+" dollars.");
    }
}