import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        double N = 0;
        double x = 0, m = 0;
        int count;
        for(int i = 0; i < T; i++)
        {
            count = 0;
            N = input.nextDouble();
            m = N;
            while(m > 0)
            {
            	x = m % 10;
            	if(N % x == 0.0)
                {
                    count++;
                }
                m = (m - x) / 10;
            }
            System.out.println(count);
        }
    }
}