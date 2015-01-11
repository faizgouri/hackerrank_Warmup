/* Problem Statement:
https://www.hackerrank.com/challenges/is-fibo  */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long fib0 = 0;
        long fib1 = 1;
        long n = 0;
        long temp = 0;
        for(int i = 0; i < t; i++)
        {
            n = input.nextLong();
            fib0 = 0;
            fib1 = 1;
            temp = 0;
            if(n == fib0 || n == fib1)
            {
                System.out.println("IsFibo");
            }
            else
            {
                while(fib1 <= n)
                {
                    if(n == fib1) 
                    {
                        System.out.println("IsFibo");
                        temp = -1;
                        break;
                    }
                    temp = fib0;
                    fib0 = fib1;
                    fib1 = fib0 + temp;
                    //fibn = fib0 + fib1;
                }
                if(temp != -1)
                {
                    System.out.println("IsNotFibo");   
                }
            }
        }
    }
}