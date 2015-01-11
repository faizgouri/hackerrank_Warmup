import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int i = 0;
        long count = 0;
        long a = 0, b = 0;
        double sqr1 = 0, sqr2 = 0;
        for(i = 0; i < t; i++)
        {
            count = 0;
            a = input.nextLong();
            b = input.nextLong();
            sqr1 = Math.sqrt(a);
            sqr2 = Math.sqrt(b);
            count = (long)Math.floor(sqr2) - (long)Math.ceil(sqr1) + 1;
            System.out.println(count);
        }
    }
}