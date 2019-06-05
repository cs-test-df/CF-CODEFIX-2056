import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SubArray {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        
        char[] input = s.toCharArray();
        int valley=0;
        int count =1;
        int seaLevel = 0;
        boolean down = false;
        for(int i =0;i<n-1;i++){
            if(input[i]=='D'){ 
            	seaLevel--;
            	down = true;
            }
            if(input[i]=='U') seaLevel++;
           
                if(down && seaLevel==0){
                    valley++;
                    down = false;
                }  
        }
        return valley;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

       System.out.println(result);

        scanner.close();
    }
}
