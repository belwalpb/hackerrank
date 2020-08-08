import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int total = arr.length;
        double p=0;
        double z=0;
        double n=0;
        for(int i : arr)
        {
            if(i>0)
               { p++; }
            
               if(i==0)
               { z++;}

                if(i<0)
               { n++;}
        }
 DecimalFormat df = new DecimalFormat("#.######");
 df.setRoundingMode(RoundingMode.CEILING);

  System.out.println(df.format(p/total));
  System.out.println(df.format(n/total));
  System.out.println(df.format(z/total));
  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
