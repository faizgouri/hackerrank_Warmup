/* Problem Statement
https://www.hackerrank.com/challenges/manasa-and-stones  */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int i = 0, j = 0;
        int a= 0, b =0, n = 0, last = 0, temp = 0;
        for(i = 0; i < t; i++)
        {
            last = 0;
            n = input.nextInt();
            a = input.nextInt();
            b = input.nextInt();
            if(b < a)
            {
                temp = b;
                b = a;
                a= temp;
            }
            if(a == b)
            {
                System.out.println((n - 1) * a);
                continue;
            }
            for(j = 0; j < n; j++)
            {
                last = (n - j - 1) * a + j * b;
                System.out.print(last+" ");
            }
            System.out.println();
        }
    }
}