import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int i = 0, n = 0, c = 0, m = 0;
        int count = 0, wrap = 0;
        for(i = 0; i < t; i++)
        {
            count = 0;
            wrap = 0;
            n = input.nextInt();
            c = input.nextInt();
            m = input.nextInt();
            count = n / c;
            wrap = count;
            while(wrap >= m)
            {
                count = count + wrap / m;
                wrap = wrap / m + wrap % m;
            }
            System.out.println(count);
        }
    }
}