import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long n = 0;
        String str = "";
        for(int i = 0; i < t; i++)
        {
        	n = input.nextLong(); // read an unsigned integer 
        	str = Long.toBinaryString(~n); // convert to binary and flip the bits
        	str = str.substring(32); // take last 32 bits
        	System.out.println(Long.parseLong(str, 2)); // convert to decimal
        }
        input.close();
     }
}